package com.smart.parking.service;

import com.smart.parking.abstracts.AbstractService;
import com.smart.parking.dto.CourtyardDTO;
import com.smart.parking.dto.CustomerDTO;
import com.smart.parking.mapper.ICourtyardMapper;
import com.smart.parking.mapper.ICustomerMapper;
import com.smart.parking.repository.ICourtyardRepository;
import com.smart.parking.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CourtyardServiceImpl extends AbstractService<CourtyardDTO, UUID> {
    @Autowired
    public CourtyardServiceImpl(ICourtyardRepository repository, ICourtyardMapper mapper) {
        super(repository, mapper);
    }
}
