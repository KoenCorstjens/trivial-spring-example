package eu.corstjens.spring.example.entities;

import org.springframework.stereotype.Component;

@Component
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
