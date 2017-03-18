package es.elvalledeljedi.swlcgdb.domain.repository;


import java.util.List;

import javax.inject.Inject;

import es.elvalledeljedi.swlcgdb.domain.datasource.ReadWriteAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.datasource.ReadableAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.datasource.WritableAsyncDataSource;
import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.domain.model.Result;
import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;

/**
 * Created by ikari on 19/3/17.
 */

public class AsyncRepository<T extends BaseEntity,Q,K> implements
        ReadableAsyncRepository<T,Q,K>, WritableAsyncRepository<T>,
        ReadableAsyncDataSource.Callback<T>, WritableAsyncDataSource.Callback<T>
{
    private final List<ReadWriteAsyncDataSource> dataSources;
    private final Callback<T> callback;

    @Inject
    public AsyncRepository(List<ReadWriteAsyncDataSource> dataSources, Callback<T> callback) {
        this.dataSources = dataSources;
        this.callback = callback;
    }

    @Override
    public void getAll(ReadableAsyncRepository.Callback<T> callback) {
        for (ReadableAsyncDataSource ds:dataSources) {
            if(ds.isAllValid()){
                ds.getAll(this);
            }
        }
    }

    @Override
    public void getQuery(Q query, ReadableAsyncRepository.Callback<T> callback) {
        for (ReadableAsyncDataSource ds:dataSources) {
            if(ds.isAllValid()){
                ds.getQuery(query,this);
            }
        }
    }

    @Override
    public void getByKey(K id, ReadableAsyncRepository.Callback<T> callback) {
        for (ReadableAsyncDataSource ds:dataSources) {
            ds.getByKey(id,this);
        }
    }

    @Override
    public void add(T item, WritableAsyncRepository.Callback<T> callback) {
        for(WritableAsyncDataSource ds: dataSources){
            ds.add(item,this);
        }
    }

    @Override
    public void update(T item, WritableAsyncRepository.Callback<T> callback) {
        for(WritableAsyncDataSource ds: dataSources){
            ds.update(item,this);
        }
    }

    @Override
    public void delete(T item, WritableAsyncRepository.Callback<T> callback) {
        for(WritableAsyncDataSource ds: dataSources){
            ds.delete(item,this);
        }
    }

    @Override
    public void onWriteSuccess(T value) {
        callback.onWriteSuccess(Result.<T, BaseError>withSuccess(value));
    }

    @Override
    public void onWriteError(BaseError error) {
        callback.onWriteError(Result.<T, BaseError>withError(error));
    }

    @Override
    public void onReadSuccess(T value) {
        callback.onReadSuccess(Result.<T, BaseError>withSuccess(value));
    }

    @Override
    public void onReadListSuccess(List<T> values) {
        callback.onReadListSuccess(Result.<List<T>, BaseError>withSuccess(values));
    }

    @Override
    public void onReadError(BaseError error) {
        callback.onReadError(Result.<T, BaseError>withError(error));

    }

    public interface Callback<T> extends
            ReadableAsyncRepository.Callback<T>, WritableAsyncRepository.Callback<T>{

    }
}
