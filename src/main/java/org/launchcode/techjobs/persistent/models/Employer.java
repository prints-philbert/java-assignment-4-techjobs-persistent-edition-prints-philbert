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

    @OneToMany(mappedBy = "employer") // need parameter
    @JoinColumn
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
