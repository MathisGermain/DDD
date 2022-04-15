package com.esgi.alasso.infrastructure.paiement;


import com.esgi.alasso.model.paiement.Cotisation;


import java.util.ArrayList;
import java.util.List;

public class CotisationDaoMemoryList implements CotisationDao {

    private static CotisationDaoMemoryList INSTANCE;
    private List<Cotisation> cotisations = new ArrayList<>();
    private CotisationDaoMemoryList () {

    }

    public static CotisationDaoMemoryList getInstance()
    {  if (INSTANCE == null) {
        INSTANCE= new CotisationDaoMemoryList();
    }
        return INSTANCE;
    }

    @Override
    public void deleteAll() {
        this.cotisations.clear();
    }

    @Override
    public void nouvelleCotisation(Cotisation cotisation) {
        cotisations.add(cotisation);


    }

    @Override
    public List<Cotisation> getCotisations() {
        return cotisations;
    }
}
