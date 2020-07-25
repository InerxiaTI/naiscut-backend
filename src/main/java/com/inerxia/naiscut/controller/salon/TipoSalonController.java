package com.inerxia.naiscut.controller.salon;

import com.inerxia.naiscut.facade.salon.TipoSalonFacade;
import com.inerxia.naiscut.facade.salon.dto.TipoSalonDto;
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
@RequestMapping("/tipo-salon")
public class TipoSalonController {

    private TipoSalonFacade tipoSalonFacade;

    public TipoSalonController(TipoSalonFacade tipoSalonFacade) {
        this.tipoSalonFacade = tipoSalonFacade;
    }

    @GetMapping("/get-por-id/{id}")
    @ApiOperation(value = "Busca el tipo salon por id", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La petición fue procesada con éxito"),
            @ApiResponse(code = 400, message = "La petición es inválida"),
            @ApiResponse(code = 500, message = "Error del servidor al procesar la respuesta"),
    })
    public ResponseEntity<StandardResponse<TipoSalonDto>> findById(@PathVariable Integer id){
        TipoSalonDto tipoSalonDto = tipoSalonFacade.findById(id);
        return ResponseEntity.ok(new StandardResponse<>(
                StandardResponse.EstadoStandardResponse.OK,
                tipoSalonDto));
    }
}