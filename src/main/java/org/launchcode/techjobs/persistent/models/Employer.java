package org.launchcode.techjobs.persistent.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @NotBlank(message = "Location is required")
    @Size(max = 50, message = "Location must be less than 50 characters long")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {}
}
