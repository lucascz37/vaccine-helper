package com.edu.lucas.vaccinationHelper.repository;
/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/

import com.edu.lucas.vaccinationHelper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT i FROM User i where i.email = :email")
    Optional<User> findByEmail(@Param("email") String email);
}
