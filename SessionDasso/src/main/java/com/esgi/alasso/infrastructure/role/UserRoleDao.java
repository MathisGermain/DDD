package com.esgi.alasso.infrastructure.role;

import com.esgi.alasso.model.role.Role;
import com.esgi.alasso.model.role.UserRole;

import java.util.List;

public interface UserRoleDao {

    public List<UserRole> getUserRoles();
    public void deleteAll ();
    public void nouveauUserRole (UserRole userRole);
    public boolean hasUserRole (String user, String role);
    public void deleteUserRole (String user, String role);


}
