package com.edu.lucas.vaccinationHelper.dto;
/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class VaccinationCreateRequest {

    @NotBlank
    String name;

    @NotBlank
    @Email
    String email;

    @NotNull
    Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
