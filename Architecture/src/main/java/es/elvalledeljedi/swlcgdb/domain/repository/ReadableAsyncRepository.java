package es.elvalledeljedi.swlcgdb.domain.repository;

import java.util.List;

import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.domain.model.Result;
import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;

/**
 * Created by ikari on 18/3/17.
 */

public interface ReadableAsyncRepository<T extends BaseEntity,Q,K> {
    void getAll(Callback<T> callback);
    void getQuery(Q query, Callback<T> callback);
    void getByKey(K id, Callback<T> callback);

    interface Callback<T>{
        void onReadSuccess(Result<T, BaseError> result);
        void onReadListSuccess(Result<List<T>, BaseError> result);
        void onReadError(Result<T, BaseError> result);
    }
}
