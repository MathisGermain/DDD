package com.esgi.alasso.infrastructure.role;

import com.esgi.alasso.model.role.UserRole;

import java.util.List;

public class UserRoleDaoMemoryList implements UserRoleDao {


    private static UserRoleDaoMemoryList INSTANCE;

    private UserRoleDaoMemoryList (){

    }

    public UserRoleDaoMemoryList GetInstance(){
        if (INSTANCE == null) INSTANCE = new UserRoleDaoMemoryList();
        return INSTANCE;
    }
    private List<UserRole> userRoles;
    @Override
    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void nouveauUserRole(UserRole userRole) {
        userRoles.add(userRole);

    }

    @Override
    public boolean hasUserRole(String user, String role) {
        for (UserRole userRole: userRoles){
            if (userRole.getRole_id().equals(role) && userRole.getUser_id().equals(user)) return true;
        }
        return false;
    }

    @Override
    public void deleteUserRole(String user, String role) {
        for (UserRole userRole : userRoles){
            if (userRole.getRole_id().equals(role) && userRole.getUser_id().equals(user)) userRoles.remove(userRole);
        }

    }

}
