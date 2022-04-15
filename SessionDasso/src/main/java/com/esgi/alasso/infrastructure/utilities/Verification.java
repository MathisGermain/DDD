package com.esgi.alasso.infrastructure.utilities;


import static java.util.Objects.isNull;

public class Verification {

    public static void name (String s)  {
        if (isNull(s) || s.isEmpty()) throw new InvalidatedNameException();

    }
}
