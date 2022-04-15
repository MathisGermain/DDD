package com.esgi.alasso.model.paiement;

import java.util.Date;

public class Cotisation {

    private String association_id;
    private String user_id;
    private Date date_adhesion;
    private Date date_fin;

    public String getAssociation_id() {
        return association_id;
    }

    public void setAssociation_id(String association_id) {
        this.association_id = association_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getDate_adhesion() {
        return date_adhesion;
    }

    public void setDate_adhesion(Date date_adhesion) {
        this.date_adhesion = date_adhesion;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
}
