package com.esgi.alasso.infrastructure.utilisateur;

import com.esgi.alasso.model.user.User;

import java.util.List;

public interface UserDao {

    public List<User> getUtilisateurs();
    public void deleteAll ();
    public void createUser(User user);
    public boolean isUserExists (String id);
}
