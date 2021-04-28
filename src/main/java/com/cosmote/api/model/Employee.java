package com.cosmote.api.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @Column(length = 255, name = "name")
    @Size(max = 255,message = "name cannot be greater than 255 characters")
    @NotBlank(message = "name cannot be empty or null")
    private String name;
    @Column(length = 255, name = "email")
    @Size(max = 255,message = "email cannot be greater than 255 characters")
    @NotBlank(message = "email cannot be empty or null")
    private String email;
}
