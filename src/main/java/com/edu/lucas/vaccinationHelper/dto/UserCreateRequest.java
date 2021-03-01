package com.edu.lucas.vaccinationHelper.dto;
/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class UserCreateRequest {

    @NotBlank
    String name;

    @NotBlank
    @Email
    String email;

    @NotBlank
    @CPF
    String cpf;

    @NotNull
    Date birth;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
