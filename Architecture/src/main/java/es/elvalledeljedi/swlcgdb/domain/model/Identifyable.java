package es.elvalledeljedi.swlcgdb.domain.model;

/**
 * Created by ikari on 18/3/17.
 */

public interface Identifyable<K> {
    K getKey();
    void setKey(K key);
}
