package com.inerxia.naiscut.controller.cliente;

import com.inerxia.naiscut.facade.cliente.TipoIdentificacionFacade;
import com.inerxia.naiscut.facade.cliente.dto.TipoIdentificacionDto;
import com.inerxia.naiscut.facade.ocupacion.dto.OcupacionDto;
import com.inerxia.naiscut.util.StandardResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipo-identificacion")
public class TipoIdentificacionController {
    private TipoIdentificacionFacade tipoIdentificacionFacade;

    public TipoIdentificacionController(TipoIdentificacionFacade tipoIdentificacionFacade) {
        this.tipoIdentificacionFacade = tipoIdentificacionFacade;
    }

    @GetMapping("/get-por-id/{id}")
    @ApiOperation(value = "Busca el tipo identificacion por id", response = TipoIdentificacionDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La petición fue procesada con éxito"),
            @ApiResponse(code = 400, message = "La petición es inválida"),
            @ApiResponse(code = 500, message = "Error del servidor al procesar la respuesta"),
    })
    public ResponseEntity<StandardResponse<TipoIdentificacionDto>> findById(@PathVariable Integer id){
        TipoIdentificacionDto tipoIdentificacionDto = tipoIdentificacionFacade.findById(id);
        return ResponseEntity.ok(new StandardResponse<>(
                StandardResponse.EstadoStandardResponse.OK,
                tipoIdentificacionDto));
    }
}