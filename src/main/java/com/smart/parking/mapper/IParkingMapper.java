package com.smart.parking.mapper;

import com.smart.parking.domain.Parking;
import com.smart.parking.dto.ParkingDTO;
import com.smart.parking.interfaces.IDomainMapper;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 19/09/2019
 */

@Mapper
public interface IParkingMapper extends IDomainMapper<Parking, ParkingDTO> {
    @Override
    ParkingDTO toDTO(final Parking domain);
    @Override
    Parking toDomain(final ParkingDTO dto);
    @Override
    List<ParkingDTO> toPageDTO(final List<Parking> items);
}
