package com.smart.parking.service;

import com.smart.parking.abstracts.AbstractService;
import com.smart.parking.dto.VehicleDTO;
import com.smart.parking.mapper.IVehicleMapper;
import com.smart.parking.repository.IVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleServiceImpl extends AbstractService<VehicleDTO, UUID> {
    @Autowired
    public VehicleServiceImpl(IVehicleRepository repository, IVehicleMapper mapper) {
        super(repository, mapper);
    }
}
