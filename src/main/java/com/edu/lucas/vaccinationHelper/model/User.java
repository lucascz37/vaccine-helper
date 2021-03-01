package com.edu.lucas.vaccinationHelper.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/
@Entity
@Table(name = "users",
        uniqueConstraints= {@UniqueConstraint(columnNames = {"email"}), @UniqueConstraint(columnNames = {"cpf"})})

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotNull
    String name;

    @NotNull
    String email;

    @NotNull
    String cpf;

    @NotNull
    Date birth;

    public User(){
    }

    public User(@NotNull String name, @Email @NotNull String email, @NotNull String cpf, @NotNull Date birth) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birth = birth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
