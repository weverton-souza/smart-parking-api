package com.smart.parking.service;

import com.smart.parking.abstracts.AbstractService;
import com.smart.parking.dto.ParkingDTO;
import com.smart.parking.mapper.IParkingMapper;
import com.smart.parking.repository.IParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ParkingServiceImpl extends AbstractService<ParkingDTO, UUID> {
    @Autowired
    public ParkingServiceImpl(IParkingRepository repository, IParkingMapper mapper) {
        super(repository, mapper);
    }
}
