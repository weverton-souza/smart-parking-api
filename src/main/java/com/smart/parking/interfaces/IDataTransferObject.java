package com.smart.parking.interfaces;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
public interface IDataTransferObject extends Serializable {
    Object setId(final UUID id);
    UUID getId();
}
