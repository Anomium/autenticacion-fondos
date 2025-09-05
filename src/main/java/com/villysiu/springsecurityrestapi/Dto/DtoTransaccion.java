package com.villysiu.springsecurityrestapi.Dto;

import java.util.List;


public class DtoTransaccion {

    private String id;
    private String identificadorUnicoTransaccion;
    private DtoCliente cliente;
    private List<Fondo> fondo;

    private String idFondo;

    public DtoTransaccion(String id, String identificadorUnicoTransaccion, DtoCliente cliente, List<Fondo> fondo) {
        this.id = id;
        this.identificadorUnicoTransaccion = identificadorUnicoTransaccion;
        this.cliente = cliente;
        this.fondo = fondo;
    }

    public DtoTransaccion(String id, String idFondo) {
        this.id = id;
        this.idFondo = idFondo;
    }

    public DtoTransaccion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentificadorUnicoTransaccion() {
        return identificadorUnicoTransaccion;
    }

    public void setIdentificadorUnicoTransaccion(String identificadorUnicoTransaccion) {
        this.identificadorUnicoTransaccion = identificadorUnicoTransaccion;
    }

    public DtoCliente getCliente() {
        return cliente;
    }

    public void setCliente(DtoCliente cliente) {
        this.cliente = cliente;
    }

    public List<Fondo> getFondo() {
        return fondo;
    }

    public void setFondo(List<Fondo> fondo) {
        this.fondo = fondo;
    }

    public String getIdFondo() {
        return idFondo;
    }

    public void setIdFondo(String idFondo) {
        this.idFondo = idFondo;
    }
}
