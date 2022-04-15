package com.esgi.alasso.model.paiement;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Cotisation {

    private String association_id;
    private String user_id;
    private LocalDate date_adhesion;
    private LocalDate date_fin;

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

    public LocalDate getDate_adhesion() {
        return date_adhesion;
    }

    public void setDate_adhesion(LocalDate date_adhesion) {
        this.date_adhesion = date_adhesion;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public Cotisation(String association_id, String user_id, LocalDate date_adhesion, LocalDate date_fin) {
        this.association_id = association_id;
        this.user_id = user_id;
        this.date_adhesion = date_adhesion;
        this.date_fin = date_fin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cotisation that = (Cotisation) o;
        return Objects.equals(association_id, that.association_id) && Objects.equals(user_id, that.user_id) && Objects.equals(date_adhesion, that.date_adhesion) && Objects.equals(date_fin, that.date_fin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(association_id, user_id, date_adhesion, date_fin);
    }

    @Override
    public String toString() {
        return "Cotisation{" +
                "association_id='" + association_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", date_adhesion=" + date_adhesion +
                ", date_fin=" + date_fin +
                '}';
    }
}
