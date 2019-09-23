package com.smart.parking.mapper;

import com.smart.parking.domain.Courtyard;
import com.smart.parking.dto.CourtyardDTO;
import com.smart.parking.interfaces.IDomainMapper;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 20/09/2019
 */

@Mapper
public interface ICourtyardMapper extends IDomainMapper<Courtyard, CourtyardDTO> {
    @Override
    CourtyardDTO toDTO(final Courtyard domain);
    @Override
    Courtyard toDomain(final CourtyardDTO dto);
    @Override
    List<CourtyardDTO> toPageDTO(final List<Courtyard> items);
}