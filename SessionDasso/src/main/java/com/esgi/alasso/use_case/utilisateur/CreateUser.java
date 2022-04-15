package com.esgi.alasso.use_case.utilisateur;

import com.esgi.alasso.infrastructure.factories.CreateUUID;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.infrastructure.utilities.Verification;
import com.esgi.alasso.model.user.User;

public class CreateUser {

    private final UserDao userDao;
    private final User user;


    public User execute(){
        userDao.createUser(user);
        return user;
    }

    public CreateUser(UserDao userDao, String email, String name, String firstname) {
        this.userDao = userDao;
        Verification.name(name);
        Verification.name(firstname);
        Verification.email(email);

        String id = CreateUUID.execute();

        this.user = new User(id, email,name,firstname);

    }
}
