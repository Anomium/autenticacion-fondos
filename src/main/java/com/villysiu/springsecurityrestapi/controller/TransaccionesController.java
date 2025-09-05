package com.villysiu.springsecurityrestapi.controller;

import com.villysiu.springsecurityrestapi.Dto.DtoTransaccion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/secret_resource")
public class TransaccionesController {

    private final Transacciones transacciones;

    public TransaccionesController(Transacciones transacciones) {
        this.transacciones = transacciones;
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crear(@RequestBody DtoTransaccion dtoTransaccion) {
        return transacciones.crearTransaccion(dtoTransaccion);
    }

    @PostMapping("/cancelar/suscripcion")
    public ResponseEntity<?> cancelarSuscripcion(@RequestBody DtoTransaccion dtoTransaccion) {
        return transacciones.cancelarSuscripcion(dtoTransaccion);
    }

    @GetMapping("/listar")
    public List<DtoTransaccion> listar() {
        return transacciones.listar();
    }
}
