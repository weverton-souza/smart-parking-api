package com.smart.parking.resource;

import com.smart.parking.abstracts.AbstractResource;
import com.smart.parking.dto.UserAccessDTO;
import com.smart.parking.dto.VehicleDTO;
import com.smart.parking.service.UserAccessServiceImpl;
import com.smart.parking.service.VehicleServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/user-accesses")
@Api(value = "User Access", tags = "User Access")
public class UserAccessResourceImpl extends AbstractResource<UserAccessDTO, UUID> {
    @Autowired
    public UserAccessResourceImpl(final UserAccessServiceImpl service) {
        super(service);
    }
}
