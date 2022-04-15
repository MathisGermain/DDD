package com.esgi.alasso.model.user;

public class UserMemberValidation {

    public UserMemberValidation (boolean b) {
        if (!b) throw new UserIsNotANotMemberException();
    }
}
