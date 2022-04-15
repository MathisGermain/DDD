package com.esgi.alasso.infrastructure.utilisateur;

import com.esgi.alasso.model.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMemoryList implements UserDao {

    private static UserDaoMemoryList INSTANCE;
    private List<User> users = new ArrayList<>();
    private UserDaoMemoryList() {

    }

    public static UserDaoMemoryList getInstance()
    {   if (INSTANCE == null) {
        INSTANCE = new UserDaoMemoryList();
    }
        return INSTANCE;
    }

    @Override
    public void deleteAll() {
        this.users.clear();
    }

    @Override
    public List<User> getUtilisateurs() {
        return users;
    }

    @Override
    public void createUser(User user) {
        users.add(user);
    }

}
