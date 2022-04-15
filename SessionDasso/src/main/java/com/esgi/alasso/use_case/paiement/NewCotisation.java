package com.esgi.alasso.use_case.paiement;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.paiement.CotisationDao;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.infrastructure.role.UserRoleDao;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.infrastructure.utilities.Verification;
import com.esgi.alasso.model.paiement.Cotisation;
import com.esgi.alasso.model.role.UserRole;

import java.time.LocalDate;

public class NewCotisation {


    private final CotisationDao cotisationDao;
    private final UserRoleDao userRoleDao;
    private final UserDao userDao;
    private final AssociationDao associationDao;
    private final RoleDao roleDao;
    private final Cotisation cotisation;
    private final String userId;
    private final String associationId;

    public void execute(Cotisation cotisation) {

        cotisationDao.nouvelleCotisation(cotisation);
        String notMember = roleDao.findRoleWithAssociationAndRoleName(associationId, "notMember");
        String member = roleDao.findRoleWithAssociationAndRoleName(associationId, "member");
        userRoleDao.nouveauUserRole();
        userRoleDao.deleteUserRole(userId, notMember);
    }

    public NewCotisation(String associationId, String userId, CotisationDao cotisationDao, UserRoleDao userRoleDao, AssociationDao associationDao, UserDao userDao, RoleDao roleDao) {
        this.cotisationDao = cotisationDao;
        this.userRoleDao = userRoleDao;
        this.userDao = userDao;
        this.roleDao = roleDao;
        this.associationDao = associationDao;
        this.associationId = associationId;
        this.userId = userId;

        Verification.existAssociation(associationDao, associationId);
        Verification.existUser(userDao, userId);


        Verification.userIsNotMember(roleDao, userRoleDao, userId, associationId);

        cotisation = new Cotisation (associationId, userId, LocalDate.now(), LocalDate.now().plusYears(1));


        this.cotisation = cotisation;
    }


}
