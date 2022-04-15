package com.esgi.alasso.model.user;

import com.esgi.alasso.model.role.UserRole;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(name, user.name) && Objects.equals(firstname, user.firstname) && Objects.equals(roles, user.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name, firstname, roles);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", roles=" + roles +
                '}';
    }
}
