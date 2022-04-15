package com.esgi.alasso.use_case.role;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.infrastructure.role.UserRoleDao;
import com.esgi.alasso.infrastructure.utilities.Verification;
import com.esgi.alasso.model.role.Role;
import com.esgi.alasso.model.role.UserRole;
import com.esgi.alasso.model.user.User;

public class AttributionRole {

    private final UserRoleDao userRoleDao;
    private final UserRole userRole;

    public void execute(){
        userRoleDao.nouveauUserRole(userRole);
    }

    public AttributionRole(UserRoleDao userRoleDao, AssociationDao associationDao, String roleId, String userId) {

        this.userRoleDao = userRoleDao;

        String id = CreateUUID.execute();
        this.userRole = new UserRole(id,roleId, userId);

    }
}
