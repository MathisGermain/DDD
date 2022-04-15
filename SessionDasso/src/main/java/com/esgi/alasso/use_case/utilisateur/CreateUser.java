package com.esgi.alasso.use_case.utilisateur;

import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.infrastructure.utilities.Verification;
import com.esgi.alasso.model.user.User;

public class CreateUser {

    private final UserDao userDao;
    private final User user;


    public void execute(){
        userDao.createUser(user);
    }

    public CreateUser(UserDao userDao, String email, String name, String firstname) {
        this.userDao = userDao;
        Verification.name(name);
        Verification.name(firstname);
        Verification.email(email);

        this.user = new User(email,name,firstname);

    }
}
