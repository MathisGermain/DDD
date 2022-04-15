package com.esgi.alasso.infrastructure.utilities;


import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;

import static java.util.Objects.isNull;

public class Verification {

    public static void name (String s)  {
        if (isNull(s) || s.isEmpty()) throw new InvalidatedNameException();

    }

    public static void existAssociation (AssociationDao associationDao, String id) {
        if (isNull(id) || id.isEmpty() || !associationDao.isAssociationExists(id)) throw new AssociationNotExistsException();
    }
    public static void existUser (UserDao userDao,String id) {
        if (isNull(id) || id.isEmpty() || !userDao.isUserExists(id)) throw new UserNotExistsException();
    }

}
