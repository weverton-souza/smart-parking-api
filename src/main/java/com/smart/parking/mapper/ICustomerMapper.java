package com.smart.parking.mapper;

import com.smart.parking.domain.Customer;
import com.smart.parking.dto.CustomerDTO;
import com.smart.parking.interfaces.IDomainMapper;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 20/09/2019
 */

@Mapper
public interface ICustomerMapper extends IDomainMapper<Customer, CustomerDTO> {
    @Override
    CustomerDTO toDTO(final Customer domain);
    @Override
    Customer toDomain(final CustomerDTO dto);
    @Override
    List<CustomerDTO> toPageDTO(final List<Customer> items);
}