package com.esgi.alasso.model.user;

import static java.util.Objects.isNull;

public class UserValidation {

    public UserValidation(String id, boolean exist){
        if (isNull(id) || id.isEmpty() || !exist) throw new UserNotExistsException();
    }
}
