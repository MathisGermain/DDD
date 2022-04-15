package com.esgi.alasso.model.association;

public class Association {

    private String id;
    private String name;
    private String owner_id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public Association(String id, String name, String owner_id) {
        this.id = id;
        this.name = name;
        this.owner_id = owner_id;
    }
}
