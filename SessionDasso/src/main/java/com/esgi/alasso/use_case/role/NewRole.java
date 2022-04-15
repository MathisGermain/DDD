package com.esgi.alasso.use_case.role;


import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.model.verification.Verification;
import com.esgi.alasso.model.role.Role;
import com.esgi.alasso.model.association.AssociationNotExistsException;

import static java.util.Objects.isNull;


public class NewRole {
    private final RoleDao roleDao;
    private final AssociationDao associationDao;
    private final Role role;

    public Role execute() {
        roleDao.newRole(role);
        return role;
    }

    public NewRole(String name, String associationId, RoleDao roleDao, AssociationDao associationDao) {
        this.roleDao = roleDao;
        this.associationDao = associationDao;

        Verification.name(name);
        if (isNull(associationId) || associationId.isEmpty() || !associationDao.isAssociationExists(associationId)) throw new AssociationNotExistsException();
        String id = CreateUUID.execute();

        this.role = new Role (id, associationId, name);
    }



}
