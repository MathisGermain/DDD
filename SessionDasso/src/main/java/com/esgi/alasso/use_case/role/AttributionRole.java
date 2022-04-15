package com.esgi.alasso.use_case.role;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.infrastructure.utilities.Verification;
import com.esgi.alasso.model.role.Role;

public class AttributionRole {

    private final RoleDao roleDao;
    private final Role role;

    public AttributionRole(RoleDao roleDao, AssociationDao associationDao, String association_id, String name) {


        this.roleDao = roleDao;
        Verification.name(name);
        Verification.existAssociation(associationDao,association_id);

        String id = CreateUUID.execute();

        this.role = new Role(id,association_id,name);


    }
}
