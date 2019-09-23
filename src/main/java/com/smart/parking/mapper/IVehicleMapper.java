package com.smart.parking.mapper;

import com.smart.parking.domain.Vehicle;
import com.smart.parking.dto.VehicleDTO;
import com.smart.parking.interfaces.IDomainMapper;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 19/09/2019
 */

@Mapper
public interface IVehicleMapper extends IDomainMapper<Vehicle, VehicleDTO> {
    @Override
    VehicleDTO toDTO(final Vehicle domain);
    @Override
    Vehicle toDomain(final VehicleDTO dto);
    @Override
    List<VehicleDTO> toPageDTO(final List<Vehicle> items);
}
