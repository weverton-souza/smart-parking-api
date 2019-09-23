package com.smart.parking.interfaces;

import com.smart.parking.abstracts.AbstractDataTransferObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
public interface IService<D extends AbstractDataTransferObject, K extends Serializable> {
    IDataTransferObject saveOrUpdate(final D resource);
    IDataTransferObject findById(final K id);
    Page<IDataTransferObject> findAll(final Pageable pageable);
    void delete(K id);
}
