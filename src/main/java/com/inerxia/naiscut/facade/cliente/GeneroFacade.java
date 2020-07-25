package com.inerxia.naiscut.facade.cliente;

import com.inerxia.naiscut.facade.Facade;
import com.inerxia.naiscut.facade.GeneralFacade;
import com.inerxia.naiscut.facade.cliente.dto.GeneroDto;
import com.inerxia.naiscut.facade.mapper.GeneroMapper;
import com.inerxia.naiscut.service.cliente.GeneroService;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class GeneroFacade extends Facade<GeneroMapper, GeneroService> implements GeneralFacade<GeneroDto> {


    public GeneroFacade(GeneroMapper mapper, GeneroService service) {
        super(mapper, service);
    }

    @Override
    public GeneroDto findById(Integer id) {
        if(Objects.isNull(id)){
            throw new ObjectNotFoundException(id, "exception.objeto_no_encontrado");
        }
        return mapper.toDto(service.findById(id));
    }

    @Override
    public List<GeneroDto> findAll() {
        return null;
    }
}