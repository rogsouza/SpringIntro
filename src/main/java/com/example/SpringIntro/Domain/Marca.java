package com.example.SpringIntro.Domain;

import org.springframework.stereotype.Component;

@Component
public class Marca {

    private String name;

    public Marca() {
        System.out.println("Construtor de Marca executado.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "name='" + name + '\'' +
                '}';
    }
}
