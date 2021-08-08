package com.rjamkatel.FinanceCalculator.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="user")
public class User {
    @Id
    private Long id;
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    private String email;

    public Long getId() {
        return id; 
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

} 