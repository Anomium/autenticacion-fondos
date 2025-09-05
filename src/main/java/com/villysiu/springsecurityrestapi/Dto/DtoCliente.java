package com.villysiu.springsecurityrestapi.Dto;

import org.springframework.data.annotation.Id;


public class DtoCliente {

    @Id
    public String id;
    public String nombre;
    public String email;
    public double saldo;
    public String preferenciaNotificacion;

    public DtoCliente(String id, String nombre, String email, double saldo, String preferenciaNotificacion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.saldo = saldo;
        this.preferenciaNotificacion = preferenciaNotificacion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPreferenciaNotificacion() {
        return preferenciaNotificacion;
    }

    public void setPreferenciaNotificacion(String preferenciaNotificacion) {
        this.preferenciaNotificacion = preferenciaNotificacion;
    }
}
