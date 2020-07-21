package com.inerxia.naiscut.facade.mapper;

import com.inerxia.naiscut.facade.salon.dto.SalonDto;
import com.inerxia.naiscut.model.salon.Salon;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TipoSalonMapper.class})
public interface SalonMapper extends EntityMapper<SalonDto, Salon> {
}
