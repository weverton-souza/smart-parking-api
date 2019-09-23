package com.smart.parking.resource;

import com.smart.parking.abstracts.AbstractResource;
import com.smart.parking.dto.ParkingDTO;
import com.smart.parking.service.ParkingServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/parking-lots")
@Api(value = "Parking", tags = "Parking")
public class ParkingResourceImpl extends AbstractResource<ParkingDTO, UUID> {
    @Autowired
    public ParkingResourceImpl(final ParkingServiceImpl service) {
        super(service);
    }
}
