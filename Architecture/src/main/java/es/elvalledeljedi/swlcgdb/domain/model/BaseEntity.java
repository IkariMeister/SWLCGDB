package es.elvalledeljedi.swlcgdb.domain.model;

import java.io.Serializable;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public class BaseEntity<K> implements Serializable, Identifyable<K> {
    protected K key;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
