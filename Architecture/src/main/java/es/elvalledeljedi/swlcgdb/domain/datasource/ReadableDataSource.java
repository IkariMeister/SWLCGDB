package es.elvalledeljedi.swlcgdb.domain.datasource;

import java.util.List;

import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;

/**
 * Created by ikari on 18/3/17.
 */

public interface ReadableDataSource<T extends BaseEntity,Q,K> {

    List<T> getAll();
    List<T> getQuery(Q query);
    T getByKey(K id);
    boolean isAllValid();
    boolean isValid(T item);
}
