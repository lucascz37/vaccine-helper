package com.edu.lucas.vaccinationHelper.repository;
/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/

import com.edu.lucas.vaccinationHelper.model.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination, Long> {
}
