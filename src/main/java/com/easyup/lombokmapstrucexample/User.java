package com.easyup.lombokmapstrucexample;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private boolean enabled;
    private LocalDateTime creationDate;
    private LocalDateTime updatedDate;

}
