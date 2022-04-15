package com.esgi.alasso.model.role;

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
}
