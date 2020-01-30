package es.elvalledeljedi.swlcgdb.domain.repository;

import java.util.List;

import es.elvalledeljedi.swlcgdb.domain.model.Result;
import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;

/**
 * Created by ikari on 18/3/17.
 */

public interface ReadableRepository<T,Q,K> {
    Result<List<T>, BaseError> getAll();
    Result<List<T>, BaseError> getQuery(Q query);
    Result<T, BaseError> getByKey(K id);
}
