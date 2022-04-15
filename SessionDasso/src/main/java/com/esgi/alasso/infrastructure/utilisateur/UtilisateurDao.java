package com.esgi.alasso.infrastructure.utilisateur;

import com.esgi.alasso.model.utilisateur.Utilisateur;

import java.util.List;

public interface UtilisateurDao {


    public List<Utilisateur> getUtilisateurs();
    public void deleteAll ();
}
