package com.esgi.alasso.model.user;

import com.esgi.alasso.model.role.User_role;

import java.util.List;

public class User {

    private String id;
    private String email;
    private List<User_role> roles;

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

    public List<User_role> getRoles() {
        return roles;
    }

    public void setRoles(List<User_role> roles) {
        this.roles = roles;
    }
}
