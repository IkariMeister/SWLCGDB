package es.elvalledeljedi.swlcgdb.common.repository;

import java.util.List;

import javax.inject.Inject;

import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public class Repository<T extends BaseEntity> {

    private final DataSource<T> dataSource;

    @Inject
    public Repository(DataSource<T> dataSource) {
        this.dataSource = dataSource;
    }

    public List<T> getAll() {
        return dataSource.getAll();
    }

    public List<T> getFiltered(String mainField) {
        return dataSource.getFiltered(mainField);
    }

    public T getOne(String id) {
        return dataSource.getOne(id);
    }

    public int add(T item) {
        return dataSource.add(item);
    }

    public int delete(T item) {
        return dataSource.delete(item);
    }

}
