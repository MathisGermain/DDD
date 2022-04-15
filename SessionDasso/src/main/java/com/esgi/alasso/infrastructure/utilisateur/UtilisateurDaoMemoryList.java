package com.esgi.alasso.infrastructure.utilisateur;

import com.esgi.alasso.model.utilisateur.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurDaoMemoryList implements  UtilisateurDao{

    private static UtilisateurDaoMemoryList INSTANCE;
    private List<Utilisateur> utilisateurs = new ArrayList<>();
    private UtilisateurDaoMemoryList () {

    }

    public static UtilisateurDaoMemoryList getInstance()
    {   if (INSTANCE == null) {
        INSTANCE = new UtilisateurDaoMemoryList ();
    }
        return INSTANCE;
    }

    @Override
    public void deleteAll() {
        this.utilisateurs.clear();
    }

    @Override
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
}
