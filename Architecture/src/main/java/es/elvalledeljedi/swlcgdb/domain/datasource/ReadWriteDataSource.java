package es.elvalledeljedi.swlcgdb.domain.datasource;

import java.util.List;

import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.domain.repository.WritableRepository;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public interface ReadWriteDataSource<T extends BaseEntity,Q,K> extends
        ReadableDataSource<T,Q,K>, WritableRepository<T> {


}
