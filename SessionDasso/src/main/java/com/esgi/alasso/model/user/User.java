package com.esgi.alasso.model.user;

import com.esgi.alasso.model.role.UserRole;

import java.util.List;

public class User {

    private String id;
    private String email;
    private String name;
    private String firstname;
    private List<UserRole> roles;

    public User(String id, String email, String name, String firstname) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }
}
