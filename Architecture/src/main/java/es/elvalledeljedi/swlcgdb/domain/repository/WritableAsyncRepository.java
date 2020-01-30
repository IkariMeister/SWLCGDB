package es.elvalledeljedi.swlcgdb.domain.repository;

import es.elvalledeljedi.swlcgdb.domain.datasource.*;
import es.elvalledeljedi.swlcgdb.domain.datasource.ReadableAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.domain.model.Result;
import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;

/**
 * Created by ikari on 18/3/17.
 */

public interface WritableAsyncRepository <T extends BaseEntity> {
    void add(T item, Callback<T> callback);
    void update(T item, Callback<T> callback);
    void delete(T item, Callback<T> callback);

    interface Callback<T>{
        void onWriteSuccess(Result<T, BaseError> result);
        void onWriteError(Result<T,BaseError> result);
    }
}
