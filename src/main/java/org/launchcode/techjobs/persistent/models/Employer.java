package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "You can't leave this blank.")
    @Size(min = 3, max = 100, message = "You need a minimum of 3 characters here.")
    private String location;

    public Employer(String location) {
        this.location = location;


    }
    public Employer() {}


    public @NotBlank(message = "You can't leave this blank.") @Size(min = 3, max = 100, message = "You need a minimum of 3 characters here.") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "You can't leave this blank.") @Size(min = 3, max = 100, message = "You need a minimum of 3 characters here.") String location) {
        this.location = location;
    }
}
