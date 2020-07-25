package com.inerxia.naiscut.controller.servicio;

import com.inerxia.naiscut.facade.servicio.ServicioFacade;
import com.inerxia.naiscut.facade.servicio.dto.ServicioDto;
import com.inerxia.naiscut.util.StandardResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

    private ServicioFacade servicioFacade;

    public ServicioController(ServicioFacade servicioFacade) {
        this.servicioFacade = servicioFacade;
    }

    @GetMapping("/get-por-id/{id}")
    @ApiOperation(value = "Busca el servicio por id", response = ServicioDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La petición fue procesada con éxito"),
            @ApiResponse(code = 400, message = "La petición es inválida"),
            @ApiResponse(code = 500, message = "Error del servidor al procesar la respuesta"),
    })
    public ResponseEntity<StandardResponse<ServicioDto>> findById(@PathVariable Integer id){
        ServicioDto servicioDto = servicioFacade.findById(id);
        return ResponseEntity.ok(new StandardResponse<>(
                StandardResponse.EstadoStandardResponse.OK,
                servicioDto));
    }
}
