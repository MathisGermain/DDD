package com.esgi.alasso.use_case.role;


import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.infrastructure.utilities.Verification;
import com.esgi.alasso.model.role.Role;


public class NewRole {
    private final RoleDao roleDao;
    private final Role role;

    public void execute(Role role) {
        roleDao.newRole(role);
    }

    public NewRole(String name, String associationId, RoleDao roleDao) {
        this.roleDao = roleDao;
        Verification.name(name);
        String id = CreateUUID.execute();
        role = new Role (id, associationId, name);
    }



}