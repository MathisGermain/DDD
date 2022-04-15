package com.esgi.alasso.model.role;

import java.util.Objects;

public class Role {


    private String association_id;
    private String role_id;
    private String name;


    public String getAssociation_id() {
        return association_id;
    }

    public void setAssociation_id(String association_id) {
        this.association_id = association_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(String role_id, String association_id, String name) {
        this.association_id = association_id;
        this.role_id = role_id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(association_id, role.association_id) && Objects.equals(role_id, role.role_id) && Objects.equals(name, role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(association_id, role_id, name);
    }

    @Override
    public String toString() {
        return "Role{" +
                "association_id='" + association_id + '\'' +
                ", role_id='" + role_id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
