package es.elvalledeljedi.swlcgdb.common.repository;

import java.util.List;

import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public interface DataSource<T extends BaseEntity> {

    List<T> getAll();
    List<T> getFiltered(String mainField);
    T getOne(String id);
    int add(T item);
    int delete(T item);
    T update(T item);

}
