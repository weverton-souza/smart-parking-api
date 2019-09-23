package com.smart.parking.interfaces;

import com.smart.parking.abstracts.AbstractDataTransferObject;
import com.smart.parking.generic.GenericResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
public interface IResource<D extends AbstractDataTransferObject, K extends Serializable> {
        GenericResponse save(final D resource);
        GenericResponse update(final D resource);
        GenericResponse findById(final K id);
        Page<IDataTransferObject> findAll(final Pageable pageable);
        void delete(K id);
}
