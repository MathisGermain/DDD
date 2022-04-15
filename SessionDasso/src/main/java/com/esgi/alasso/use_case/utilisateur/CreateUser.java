package com.esgi.alasso.use_case.utilisateur;

import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.model.user.User;

public class CreateUser {

    private final UserDao userDao;
    private final User user;


    public void execute(User user){
        userDao.createUser(user);
    }

    public CreateUser(UserDao userDao, User user) {
        this.userDao = userDao;
        this.user = user;
    }
}
