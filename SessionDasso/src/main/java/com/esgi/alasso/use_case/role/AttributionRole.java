package com.esgi.alasso.use_case.role;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.role.UserRoleDao;
import com.esgi.alasso.model.role.UserRole;

public class AttributionRole {

    private final UserRoleDao userRoleDao;
    private final UserRole userRole;

    public UserRole execute(){
        userRoleDao.nouveauUserRole(userRole);
        return userRole;
    }

    public AttributionRole(UserRoleDao userRoleDao, AssociationDao associationDao, String roleId, String userId) {

        this.userRoleDao = userRoleDao;

        String id = CreateUUID.execute();
        this.userRole = new UserRole(id,roleId, userId);

    }
}
