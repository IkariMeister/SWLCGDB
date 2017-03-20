package es.elvalledeljedi.swlcgdb.domain.datasource;


import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;

/**
 * Created by ikari on 18/3/17.
 */

public interface ReadWriteAsyncDataSource<T extends BaseEntity,Q,K> extends
        ReadableAsyncDataSource<T,Q,K>,WritableAsyncDataSource<T> {

    interface Callback<T> extends ReadableAsyncDataSource.Callback, WritableAsyncDataSource.Callback{

    }
}
