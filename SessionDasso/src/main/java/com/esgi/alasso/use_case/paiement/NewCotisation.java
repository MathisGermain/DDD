package com.esgi.alasso.use_case.paiement;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.paiement.CotisationDao;
import com.esgi.alasso.infrastructure.role.UserRoleDao;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.infrastructure.utilities.Verification;
import com.esgi.alasso.model.paiement.Cotisation;

public class NewCotisation {


    private final CotisationDao cotisationDao;
    private final UserRoleDao userRoleDao;
    private final UserDao userDao;
    private final AssociationDao associationDao;
    private final Cotisation cotisation;

    public void execute(Cotisation cotisation) {
        cotisationDao.nouvelleCotisation(cotisation);
    }

    public NewCotisation(String associationId, String userId, CotisationDao cotisationDao, UserRoleDao userRoleDao, AssociationDao associationDao, UserDao userDao) {
        this.cotisationDao = cotisationDao;
        this.userRoleDao = userRoleDao;
        this.userDao = userDao;
        this.associationDao = associationDao;

        Verification.existAssociation(associationDao, associationId);
        Verification.existUser(userDao, userId);

        Verification.userAllreadyMember(userRoleDao, userId, associationId);
        Verification.userIsNotMember(userRoleDao, userId, associationId);


        this.cotisation = cotisation;
    }


}
