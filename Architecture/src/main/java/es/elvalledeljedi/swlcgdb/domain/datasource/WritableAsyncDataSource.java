package es.elvalledeljedi.swlcgdb.domain.datasource;

import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;

/**
 * Created by ikari on 18/3/17.
 */

public interface WritableAsyncDataSource<T> {
    void add(T item, Callback<T> callback);
    void delete(T item, Callback<T> callback);
    void update(T item,Callback<T> callback);

    interface Callback<T>{
        void onWriteSuccess(T value);
        void onWriteError(BaseError error);

    }
}
