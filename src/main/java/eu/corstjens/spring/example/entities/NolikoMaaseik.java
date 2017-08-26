package eu.corstjens.spring.example.entities;

import lombok.Data;


public class NolikoMaaseik implements Team {
    private String name = "Noliko Maaseik";

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
