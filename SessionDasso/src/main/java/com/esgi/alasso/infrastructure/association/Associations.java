package com.esgi.alasso.infrastructure.association;

import com.esgi.alasso.model.association.Association;

import java.util.List;

public class Associations{

    private static Associations INSTANCE = new Associations();
    private List<Association> associations;
    private Associations () {

    }

    public static Associations getInstance()
    {   return INSTANCE;
    }


}
