package com.esgi.alasso.use_case.association;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.paiement.CotisationDao;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.infrastructure.utilities.Verification;
import com.esgi.alasso.model.association.Association;
import com.esgi.alasso.model.paiement.Cotisation;

public class NewAssociation {

    private final AssociationDao associationDao;
    private final UserDao userDao;
    private final Association association;

    public void execute() {
        associationDao.nouvelleAssociation(association);
    }

    public NewAssociation(String name, String ownerId, AssociationDao associationDao, UserDao userDao) {
        this.associationDao = associationDao;
        this.userDao = userDao;

        Verification.name(name);
        Verification.existUser(this.userDao, ownerId);
        String id = CreateUUID.execute();


        this.association = new Association(id, name, ownerId);
    }
}
