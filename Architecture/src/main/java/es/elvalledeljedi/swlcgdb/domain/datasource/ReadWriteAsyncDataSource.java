package es.elvalledeljedi.swlcgdb.domain.datasource;


/**
 * Created by ikari on 18/3/17.
 */

public interface ReadWriteAsyncDataSource extends
        ReadableAsyncDataSource,WritableAsyncDataSource {

    interface Callback extends ReadableAsyncDataSource.Callback, WritableAsyncDataSource.Callback{

    }
}
