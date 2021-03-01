package com.edu.lucas.vaccinationHelper.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/
@Entity
@Table(name = "vaccination")
public class Vaccination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotNull
    String name;

    @NotNull
    Date date;

    @ManyToOne
    @NotNull
    User user;

    public Vaccination() {
    }

    public Vaccination(@NotNull String name, @NotNull Date date, User user) {
        this.name = name;
        this.date = date;
        this.user = user;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
