package com.smart.parking.mapper;

import com.smart.parking.domain.UserAccess;
import com.smart.parking.dto.UserAccessDTO;
import com.smart.parking.interfaces.IDomainMapper;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 20/09/2019
 */
@Mapper
public interface IUserAccessMapper extends IDomainMapper<UserAccess, UserAccessDTO> {
    @Override
    UserAccessDTO toDTO(final UserAccess domain);
    @Override
    UserAccess toDomain(final UserAccessDTO dto);
    @Override
    List<UserAccessDTO> toPageDTO(final List<UserAccess> items);
}