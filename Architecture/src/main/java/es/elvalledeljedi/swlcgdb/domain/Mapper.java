package es.elvalledeljedi.swlcgdb.domain;

import java.util.Collection;

/**
 * Created by ikari on 18/3/17.
 */

public interface Mapper<T,V> {
    V map(T value);
    Collection<V> map(Collection<T> value);
}
