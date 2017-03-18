package es.elvalledeljedi.swlcgdb.domain.repository;

import es.elvalledeljedi.swlcgdb.domain.model.Result;
import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;

/**
 * Created by ikari on 18/3/17.
 */

public interface WritableRepository<T> {

    Result<T, BaseError> add(T item);
    Result<T, BaseError> update(T item);
    Result<T, BaseError> delete(T item);

}
