package com.esgi.alasso.use_case.paiement;

import com.esgi.alasso.infrastructure.paiement.CotisationDao;
import com.esgi.alasso.model.paiement.Cotisation;

public class NouvelleCotisation {


    private final CotisationDao cotisationDao;
    private final Cotisation cotisation;

    public void execute(Cotisation cotisation) {
        cotisationDao.nouvelleCotisation(cotisation);
    }

    public NouvelleCotisation(Cotisation cotisation, CotisationDao cotisationDao) {
        this.cotisationDao = cotisationDao;
        this.cotisation = cotisation;
    }


}
