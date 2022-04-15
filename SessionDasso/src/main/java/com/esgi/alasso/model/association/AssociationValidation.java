package com.esgi.alasso.model.association;

import static java.util.Objects.isNull;

public class AssociationValidation {

    public AssociationValidation(String id, boolean exist) {
        if (isNull(id) || id.isEmpty() || !exist) throw new AssociationNotExistsException();
    }
}
