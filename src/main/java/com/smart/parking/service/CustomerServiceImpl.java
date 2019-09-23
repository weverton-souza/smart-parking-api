package com.smart.parking.service;

import com.smart.parking.abstracts.AbstractService;
import com.smart.parking.dto.CustomerDTO;
import com.smart.parking.mapper.ICustomerMapper;
import com.smart.parking.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl extends AbstractService<CustomerDTO, UUID> {
    @Autowired
    public CustomerServiceImpl(ICustomerRepository repository, ICustomerMapper mapper) {
        super(repository, mapper);
    }
}
