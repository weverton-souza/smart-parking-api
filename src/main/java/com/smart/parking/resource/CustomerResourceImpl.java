package com.smart.parking.resource;

import com.smart.parking.abstracts.AbstractResource;
import com.smart.parking.dto.CustomerDTO;
import com.smart.parking.service.CustomerServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/customers")
@Api(value = "Customer", tags = "Customer")
public class CustomerResourceImpl extends AbstractResource<CustomerDTO, UUID> {
        @Autowired
        public CustomerResourceImpl(final CustomerServiceImpl service) {
                super(service);
        }
}
