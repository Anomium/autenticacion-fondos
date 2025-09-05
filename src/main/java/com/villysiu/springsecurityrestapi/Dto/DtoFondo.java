package com.villysiu.springsecurityrestapi.Dto;

import org.springframework.data.annotation.Id;


public class DtoFondo {

    @Id
    private String id;
    private double monto;


    public DtoFondo(String id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
