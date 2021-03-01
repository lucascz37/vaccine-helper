package com.edu.lucas.vaccinationHelper.service;
/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/

import com.edu.lucas.vaccinationHelper.model.Vaccination;
import com.edu.lucas.vaccinationHelper.repository.VaccinationRepository;
import org.springframework.stereotype.Service;

@Service
public class VaccinationService {

    private final VaccinationRepository vaccinationRepository;

    public VaccinationService(VaccinationRepository vaccinationRepository) {
        this.vaccinationRepository = vaccinationRepository;
    }

    public Vaccination save(Vaccination vaccination){
        return vaccinationRepository.save(vaccination);
    }
}
