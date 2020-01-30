package es.elvalledeljedi.swlcgdb.domain.repository;

import java.util.List;

import javax.inject.Inject;

import es.elvalledeljedi.swlcgdb.domain.datasource.ReadWriteDataSource;
import es.elvalledeljedi.swlcgdb.domain.datasource.ReadableDataSource;
import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.domain.model.Result;
import es.elvalledeljedi.swlcgdb.domain.model.error.BaseError;
import es.elvalledeljedi.swlcgdb.domain.model.error.DataNotFoundError;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public class Repository<T extends BaseEntity,Q,K> implements
        ReadableRepository<T,Q,K>, WritableRepository<T>{

    public static final String DATA_NOT_FOUND = "Data not found in all Sources";
    private final List<ReadWriteDataSource<T,Q,K>> dataSources;

    @Inject
    public Repository(List<ReadWriteDataSource<T,Q,K>> dataSource) {
        this.dataSources = dataSource;
    }

    public Result<List<T>, BaseError> getAll() {
        for (ReadableDataSource ds:dataSources) {
            if(ds.isAllValid()){
                return Result.<List<T>,BaseError>withSuccess(ds.getAll());
            }
        }
        return Result.<List<T>,BaseError>withError(new DataNotFoundError<Void>(DATA_NOT_FOUND));
    }

    public Result<List<T>, BaseError> getQuery(Q query) {
        for (ReadableDataSource ds:dataSources) {
            if(ds.isAllValid()){
                return Result.<List<T>,BaseError>withSuccess(ds.getQuery(query));
            }
        }
        return Result.<List<T>,BaseError>withError(new DataNotFoundError<Void>(DATA_NOT_FOUND));
    }

    public Result<T, BaseError> getByKey(K id) {
        for (ReadableDataSource ds:dataSources) {
            T item = (T) ds.getByKey(id);
            if(ds.isValid(item)){
                return Result.withSuccess(item);
            }
        }
        return Result.<T,BaseError>withError(new DataNotFoundError<Void>(DATA_NOT_FOUND));
    }

    public Result<T, BaseError> add(T item) {
        for (ReadWriteDataSource ds:dataSources) {
            ds.add(item);
        }
        return Result.withSuccess(item);
    }

    @Override
    public Result<T, BaseError> update(T item) {
        for (ReadWriteDataSource ds:dataSources) {
            ds.update(item);
        }
        return Result.withSuccess(item);
    }

    public Result<T, BaseError> delete(T item) {
        for (ReadWriteDataSource ds:dataSources) {
            ds.delete(item);
        }
        return Result.withSuccess(item);
    }

}
