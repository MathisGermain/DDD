package com.esgi.alasso.infrastructure.role;

import com.esgi.alasso.model.paiement.Cotisation;
import com.esgi.alasso.model.role.Role;

import java.util.List;

public interface RoleDao {

    public List<Role> getRoles();
    public void deleteAll ();
    public void newRole (Role role);
    public String findRoleWithAssociationAndRoleName (String associationId, String name);

}
