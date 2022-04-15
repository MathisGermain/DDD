package com.esgi.alasso.infrastructure.role;


import com.esgi.alasso.model.role.Role;

import java.util.List;

public class RoleDaoMemoryList implements RoleDao {

    private static RoleDaoMemoryList INSTANCE;

    public static RoleDaoMemoryList getInstance() {
        if (INSTANCE == null) INSTANCE = new RoleDaoMemoryList();
        return INSTANCE;
    }

    private List<Role> roles;
    @Override
    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public void deleteAll() {
        roles.clear();

    }

    @Override
    public void newRole(Role role) {
        roles.add(role);

    }
}
