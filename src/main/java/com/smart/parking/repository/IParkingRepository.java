package com.smart.parking.repository;

import com.smart.parking.domain.Parking;
import com.smart.parking.interfaces.IRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
@Repository
public interface IParkingRepository extends IRepository<Parking, UUID> {
}
