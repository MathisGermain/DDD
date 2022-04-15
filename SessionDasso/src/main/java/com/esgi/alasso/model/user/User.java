package com.esgi.alasso.model.user;

import com.esgi.alasso.model.role.UserRole;

import java.util.List;

public class User {

    private String id;
    private String email;
    private List<UserRole> roles;

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

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }
}
