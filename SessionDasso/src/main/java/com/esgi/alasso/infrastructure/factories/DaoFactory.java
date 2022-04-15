package com.esgi.alasso.infrastructure.factories;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.association.AssociationDaoMemoryList;
import com.esgi.alasso.infrastructure.paiement.CotisationDao;
import com.esgi.alasso.infrastructure.paiement.CotisationDaoMemoryList;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.infrastructure.role.RoleDaoMemoryList;
import com.esgi.alasso.infrastructure.utilisateur.UtilisateurDao;
import com.esgi.alasso.infrastructure.utilisateur.UtilisateurDaoMemoryList;

public class DaoFactory {

    public static AssociationDao getChoiceDao() { return AssociationDaoMemoryList.getInstance(); }

    public static CotisationDao getOrderDao() {
        return CotisationDaoMemoryList.getInstance();
    }

    public static UtilisateurDao getUserDao() {
        return UtilisateurDaoMemoryList.getInstance();
    }

    public static RoleDao getRoleDao() {return RoleDaoMemoryList.getInstance();}
}
