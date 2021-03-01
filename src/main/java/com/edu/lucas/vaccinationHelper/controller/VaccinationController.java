package com.edu.lucas.vaccinationHelper.controller;
/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/

import com.edu.lucas.vaccinationHelper.service.UserService;
import com.edu.lucas.vaccinationHelper.service.VaccinationService;
import com.edu.lucas.vaccinationHelper.dto.Response;
import com.edu.lucas.vaccinationHelper.dto.VaccinationCreateRequest;
import com.edu.lucas.vaccinationHelper.model.User;
import com.edu.lucas.vaccinationHelper.model.Vaccination;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/vaccination")
public class VaccinationController {

    private final VaccinationService vaccinationService;
    private final UserService userService;

    public VaccinationController(VaccinationService vaccinationService, UserService userService) {
        this.vaccinationService = vaccinationService;
        this.userService = userService;
    }

    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "201", description = "Successful Operation")
    @PostMapping
    public ResponseEntity<Response> createVaccination(@Valid @RequestBody VaccinationCreateRequest body){
            User user = userService.findByEmail(body.getEmail());

            if(user != null){
                vaccinationService.save(new Vaccination(body.getName(), body.getDate(), user));
                String message = "Created";
                return new ResponseEntity<>(new Response(message), HttpStatus.CREATED);
            }

            String message = "Not Found";
            return new ResponseEntity<>(new Response(message), HttpStatus.BAD_REQUEST);
    }
}
