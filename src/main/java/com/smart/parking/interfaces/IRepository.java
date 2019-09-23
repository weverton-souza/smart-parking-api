package com.smart.parking.interfaces;

import com.smart.parking.abstracts.AbstractDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.MappedSuperclass;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
@Repository
public interface IRepository<E extends AbstractDomain, K> extends JpaRepository<E, K> {
}
