package com.smart.parking.resource;

import com.smart.parking.abstracts.AbstractResource;
import com.smart.parking.dto.CourtyardDTO;
import com.smart.parking.service.CourtyardServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/courtyards")
@Api(value = "Courtyard", tags = "Courtyard")
public class CourtyardResourceImpl extends AbstractResource<CourtyardDTO, UUID> {
        @Autowired
        public CourtyardResourceImpl(final CourtyardServiceImpl service) {
                super(service);
        }
}
