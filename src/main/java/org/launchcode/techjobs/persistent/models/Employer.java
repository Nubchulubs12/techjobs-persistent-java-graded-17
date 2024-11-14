package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "You can't leave this blank.")
    @Size(min = 3, max = 100, message = "You need a minimum of 3 characters here.")
    private String location;

    public Employer(String location) {
        super();
        this.location = location;



    }
    public Employer() {}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public @NotBlank(message = "You can't leave this blank.") @Size(min = 3, max = 100, message = "You need a minimum of 3 characters here.") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "You can't leave this blank.") @Size(min = 3, max = 100, message = "You need a minimum of 3 characters here.") String location) {
        this.location = location;
    }
}
