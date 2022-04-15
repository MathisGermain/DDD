package com.esgi.alasso.use_case.association;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.model.verification.Verification;
import com.esgi.alasso.model.association.Association;
import com.esgi.alasso.model.user.UserNotExistsException;

import static java.util.Objects.isNull;

public class NewAssociation {

    private final AssociationDao associationDao;
    private final UserDao userDao;
    private final Association association;

    public Association execute() {
        associationDao.nouvelleAssociation(association);
        return association;
    }

    public NewAssociation(String name, String ownerId, AssociationDao associationDao, UserDao userDao) {
        this.associationDao = associationDao;
        this.userDao = userDao;

        Verification.name(name);
        if (isNull(ownerId) || ownerId.isEmpty() || !userDao.isUserExists(ownerId)) throw new UserNotExistsException();
        String id = CreateUUID.execute();


        this.association = new Association(id, name, ownerId);
    }
}
