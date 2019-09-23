package com.smart.parking.resource;

import com.smart.parking.abstracts.AbstractResource;
import com.smart.parking.dto.VehicleDTO;
import com.smart.parking.service.VehicleServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/vehicles")
@Api(value = "Vehicle", tags = "Vehicle")
public class VehicleResourceImpl extends AbstractResource<VehicleDTO, UUID> {
    @Autowired
    public VehicleResourceImpl(final VehicleServiceImpl service) {
        super(service);
    }
}
