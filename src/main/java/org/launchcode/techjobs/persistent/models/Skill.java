package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;

import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "You can't leave this blank.")
    @Size(min = 3, max = 200, message = "You need at least 3 characters in this space.")
    private String description;


    public Skill(String description) {
        this.description = description;

    }
    public Skill() {}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public @NotBlank(message = "You can't leave this blank.") @Size(min = 3, max = 200, message = "You need at least 3 characters in this space.") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "You can't leave this blank.") @Size(min = 3, max = 200, message = "You need at least 3 characters in this space.") String description) {
        this.description = description;
    }
}
