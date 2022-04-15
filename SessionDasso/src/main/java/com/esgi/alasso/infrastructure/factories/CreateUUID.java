package com.esgi.alasso.infrastructure.factories;

import java.util.UUID;

public class CreateUUID {

    public static String execute () {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();

    }
}
