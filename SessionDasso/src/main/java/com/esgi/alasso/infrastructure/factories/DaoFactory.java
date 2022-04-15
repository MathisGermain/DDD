package com.esgi.alasso.infrastructure.factories;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.association.AssociationDaoMemoryList;
import com.esgi.alasso.infrastructure.paiement.CotisationDao;
import com.esgi.alasso.infrastructure.paiement.CotisationDaoMemoryList;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.infrastructure.role.RoleDaoMemoryList;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.infrastructure.utilisateur.UserDaoMemoryList;

public class DaoFactory {

    public static AssociationDao getChoiceDao() { return AssociationDaoMemoryList.getInstance(); }

    public static CotisationDao getOrderDao() {
        return CotisationDaoMemoryList.getInstance();
    }

    public static UserDao getUserDao() {
        return UserDaoMemoryList.getInstance();
    }

    public static RoleDao getRoleDao() {return RoleDaoMemoryList.getInstance();}
}
