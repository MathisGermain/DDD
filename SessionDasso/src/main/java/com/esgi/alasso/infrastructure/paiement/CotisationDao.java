package com.esgi.alasso.infrastructure.paiement;

import com.esgi.alasso.model.paiement.Cotisation;

import java.util.List;

public interface CotisationDao {
    public List<Cotisation> getCotisations();
    public void deleteAll ();
    public void nouvelleCotisation (Cotisation cotisation);

}
