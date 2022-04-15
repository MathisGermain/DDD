package com.esgi.alasso.infrastructure.association;

import com.esgi.alasso.model.association.Association;


import java.util.List;

public interface AssociationDao {
    public List<Association> getAssociations();
    public void deleteAll ();
    public void nouvelleAssociation(Association association);

}
