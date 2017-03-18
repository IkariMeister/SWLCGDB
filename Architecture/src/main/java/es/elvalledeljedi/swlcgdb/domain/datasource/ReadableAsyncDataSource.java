package es.elvalledeljedi.swlcgdb.domain.datasource;

import java.util.List;

import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;

/**
 * Created by ikari on 18/3/17.
 */

public interface ReadableAsyncDataSource<T extends BaseEntity,Q,K>  {
    void getAll(Callback<T> callback);
    void getQuery(Q query,Callback<T> callback);
    void getByKey(K id, Callback<T> callback);
    boolean isAllValid();
    boolean isValid(T item);

    public interface Callback<T>{
        void onReadSuccess(T value);
        void onReadListSuccess(List<T> values);
        void onReadError(BaseError error);
    }
}
