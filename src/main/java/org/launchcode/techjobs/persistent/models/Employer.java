package org.launchcode.techjobs.persistent.models;


import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.*;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @NotBlank(message = "Location is required")
    @Size(max = 50, message = "Location must be less than 50 characters long")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id") // What should the name of this parameter be? job id? employer? employer id?
    private final List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public Employer() {}
}
