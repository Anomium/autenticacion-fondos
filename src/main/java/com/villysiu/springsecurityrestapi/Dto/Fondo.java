package com.villysiu.springsecurityrestapi.Dto;

import org.springframework.data.annotation.Id;



public class Fondo {

    @Id
    private String id;
    private String nombre;
    private double monto;
    private String categoria;
    private String estado;

    public Fondo(String id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    public Fondo(String id, String nombre, double monto, String categoria, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
        this.categoria = categoria;
        this.estado = estado;
    }

    public Fondo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
