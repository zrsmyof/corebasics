package com.zrs.custom.collections;

/**
 * @author zrs
 */
public interface MapCustomized<K, V> {

    void put(K key, V value);

    V get(K key);
}
