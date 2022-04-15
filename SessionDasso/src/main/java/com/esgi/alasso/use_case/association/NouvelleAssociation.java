package com.esgi.alasso.use_case.association;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.paiement.CotisationDao;
import com.esgi.alasso.model.association.Association;
import com.esgi.alasso.model.paiement.Cotisation;

public class NouvelleAssociation {

    private final AssociationDao associationDao;
    private final Association association;

    public void execute(Cotisation cotisation) {
        associationDao.nouvelleAssociation(association);
    }

    public NouvelleAssociation(String nom, , AssociationDao associationDao) {
        this.associationDao = associationDao;
        this.association = association;
    }
}
