package com.esgi.alasso.infrastructure.association;

import com.esgi.alasso.infrastructure.paiement.CotisationDaoMemoryList;
import com.esgi.alasso.model.association.Association;

import java.util.ArrayList;
import java.util.List;

public class AssociationDaoMemoryList implements AssociationDao {

    private List<Association> associations = new ArrayList<>();

    private AssociationDaoMemoryList () {

    }

    private static AssociationDaoMemoryList INSTANCE;

    public static AssociationDaoMemoryList getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AssociationDaoMemoryList();
        }
        return INSTANCE;
    }
    @Override
    public List<Association> getAssociations() {
        return this.associations;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void nouvelleAssociation(Association association) {
        associations.add(association);

    }
}
