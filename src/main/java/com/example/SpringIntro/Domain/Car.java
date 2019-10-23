package com.example.SpringIntro.Domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String modelo;
    private int ano;

    @Autowired
    private Marca marca;

    public Car() {
        System.out.println("Construtor de carro executado.");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", marca=" + marca +
                '}';
    }
}
