package com.civa.reto.model.service;

import com.civa.reto.model.dto.BusDto;

import java.util.List;

public interface IBusService {
    BusDto getById(Long id);
    List<BusDto> getAll();
}
