package com.smart.parking.interfaces;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
public interface IDomainMapper<E, D> {
    D toDTO(final E domain);
    E toDomain(final D dto);
    List<D> toPageDTO(final List<E> items);
}
