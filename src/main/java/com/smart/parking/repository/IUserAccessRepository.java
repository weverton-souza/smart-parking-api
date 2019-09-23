package com.smart.parking.repository;

import com.smart.parking.domain.UserAccess;
import com.smart.parking.interfaces.IRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
@Repository
public interface IUserAccessRepository extends IRepository<UserAccess, String> {
    Optional<UserAccess> findByEmail(String email);
}
