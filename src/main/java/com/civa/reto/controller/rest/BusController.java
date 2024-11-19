package com.civa.reto.controller.rest;

import com.civa.reto.model.dto.BusDto;
import com.civa.reto.model.service.IBusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    private final IBusService busService;

    public BusController(IBusService busService) {
        this.busService = busService;
    }

    @GetMapping("/{id}")
    public BusDto getBusById(@PathVariable Long id) {
        return busService.getById(id);
    }

    @GetMapping
    public List<BusDto> getAllBuses() {
        return busService.getAll();
    }
}
