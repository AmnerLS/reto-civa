package com.civa.reto.model.service.impl;

import com.civa.reto.model.dto.BusDto;
import com.civa.reto.model.entity.Bus;
import com.civa.reto.model.repository.BusRepository;
import com.civa.reto.model.service.IBusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements IBusService {

    private final BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public BusDto getById(Long id) {
        var bus = busRepository.findById(id);

        if (bus.isEmpty()){
            throw new RuntimeException("Bus not found");
        }

        return mapToDto(bus.get());
    }

    @Override
    public List<BusDto> getAll() {
        var buses = busRepository.findAll();
        return buses.stream().map(this::mapToDto).toList();
    }

    private BusDto mapToDto(Bus bus) {
        return new BusDto(
                bus.getId(),
                bus.getNumber(),
                bus.getPlate(),
                bus.getCreatedAt().toString(),
                bus.getCharacteristics(),
                bus.getIsActive(),
                bus.getBrand().getName()
        );
    }
}
