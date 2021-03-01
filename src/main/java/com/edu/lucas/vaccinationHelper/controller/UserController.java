package com.edu.lucas.vaccinationHelper.controller;
/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/

import com.edu.lucas.vaccinationHelper.service.UserService;
import com.edu.lucas.vaccinationHelper.dto.Response;
import com.edu.lucas.vaccinationHelper.dto.UserCreateRequest;
import com.edu.lucas.vaccinationHelper.model.User;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "201", description = "Successful Operation")
    @PostMapping
    public ResponseEntity<Response> createUser(@Valid @RequestBody UserCreateRequest body){
        try{
            userService.saveUser(new User(body.getName(), body.getEmail(), body.getCpf(), body.getBirth()));
            String message = "User " + body.getName() + " Created";
            return new ResponseEntity<>(new Response(message), HttpStatus.CREATED);
        }catch (Exception e){
            String message = "Already Created";
            return new ResponseEntity<>(new Response(message),HttpStatus.BAD_REQUEST);
        }

    }

}
