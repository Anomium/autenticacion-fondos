package com.villysiu.springsecurityrestapi.controller;



import com.villysiu.springsecurityrestapi.Dto.DtoTransaccion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "localhost:8080/transaccion")
public interface Transacciones {

    @RequestMapping(method = RequestMethod.POST, value = "/crear")
    ResponseEntity<?> crearTransaccion(@RequestBody DtoTransaccion dtoTransaccion);

    @RequestMapping(method = RequestMethod.POST, value = "/cancelar/suscripcion")
    ResponseEntity<?> cancelarSuscripcion(@RequestBody DtoTransaccion dtoTransaccion);

    @RequestMapping(method = RequestMethod.GET, value = "")
    List<DtoTransaccion> listar();

}
