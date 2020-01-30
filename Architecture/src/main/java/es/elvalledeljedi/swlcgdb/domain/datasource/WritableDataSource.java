package es.elvalledeljedi.swlcgdb.domain.datasource;

/**
 * Created by ikari on 18/3/17.
 */

public interface WritableDataSource<T> {

    T add(T item);
    boolean delete(T item);
    T update(T item);
}
