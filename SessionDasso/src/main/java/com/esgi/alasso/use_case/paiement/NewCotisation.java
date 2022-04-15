package com.esgi.alasso.use_case.paiement;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.paiement.CotisationDao;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.infrastructure.role.UserRoleDao;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.model.association.AssociationValidation;
import com.esgi.alasso.model.role.UserRole;
import com.esgi.alasso.model.user.UserMemberValidation;
import com.esgi.alasso.model.user.UserValidation;
import com.esgi.alasso.model.user.UserIsNotANotMemberException;
import com.esgi.alasso.model.paiement.Cotisation;
import com.esgi.alasso.use_case.role.AttributionRole;

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



    public NewCotisation(String associationId, String userId, CotisationDao cotisationDao, UserRoleDao userRoleDao, AssociationDao associationDao, UserDao userDao, RoleDao roleDao) {
        this.cotisationDao = cotisationDao;
        this.userRoleDao = userRoleDao;
        this.userDao = userDao;
        this.roleDao = roleDao;
        this.associationDao = associationDao;
        this.associationId = associationId;
        this.userId = userId;

        String roleId = roleDao.findRoleWithAssociationAndRoleName(associationId, "notMember");
        boolean associationExists = associationDao.isAssociationExists(associationId);
        boolean userExists = userDao.isUserExists(userId);
        boolean b = userRoleDao.hasUserRole(userId, roleId);
        String notMember = this.roleDao.findRoleWithAssociationAndRoleName(this.associationId, "notMember");
        String member = this.roleDao.findRoleWithAssociationAndRoleName(this.associationId, "member");
        cotisation = new Cotisation(associationId, userId, LocalDate.now(), LocalDate.now().plusYears(1));
        UserRole userRole = new UserRole (CreateUUID.execute(), member, userId);


        new AssociationValidation(associationId, associationExists);
        new UserValidation(userId, userExists);
        new UserMemberValidation(b);




        this.userRoleDao.nouveauUserRole(userRole);
        this.cotisationDao.nouvelleCotisation(cotisation);
        this.userRoleDao.deleteUserRole(this.userId, notMember);
    }




}
