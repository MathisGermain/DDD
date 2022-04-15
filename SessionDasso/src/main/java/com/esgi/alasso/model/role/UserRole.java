package com.esgi.alasso.model.role;

import java.util.Objects;

public class UserRole {

    private String role_id;
    private String user_id;
    private String userRole_id;

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUserRole_id() {
        return userRole_id;
    }

    public void setUserRole_id(String userRole_id) {
        this.userRole_id = userRole_id;
    }

    public UserRole(String userRole_id, String role_id, String user_id) {
        this.role_id = role_id;
        this.user_id = user_id;
        this.userRole_id = userRole_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRole userRole = (UserRole) o;
        return Objects.equals(role_id, userRole.role_id) && Objects.equals(user_id, userRole.user_id) && Objects.equals(userRole_id, userRole.userRole_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role_id, user_id, userRole_id);
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "role_id='" + role_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", userRole_id='" + userRole_id + '\'' +
                '}';
    }
}
