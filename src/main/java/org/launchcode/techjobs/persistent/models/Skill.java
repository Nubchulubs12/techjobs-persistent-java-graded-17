package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank(message = "You can't leave this blank.")
    @Size(min = 3, max = 200, message = "You need at least 3 characters in this space.")
    private String description;


    public Skill() {}

    public @NotBlank(message = "You can't leave this blank.") @Size(min = 3, max = 200, message = "You need at least 3 characters in this space.") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "You can't leave this blank.") @Size(min = 3, max = 200, message = "You need at least 3 characters in this space.") String description) {
        this.description = description;
    }
}
