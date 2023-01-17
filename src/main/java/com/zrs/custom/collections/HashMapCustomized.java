package com.zrs.custom.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zrs
 */
public class HashMapCustomized<K, V> implements MapCustomized<K, V> {

    private final int SIZE_OF_BUCKET = 16;
    List<Bucket> buckets = new ArrayList<>();
    BucketStrategy strategy;

    public HashMapCustomized(BucketStrategy strategy) {
        this.strategy = strategy;
    }

    public HashMapCustomized() {
        this.strategy = new SimpleBucketStrategy();
        for (int i = 0; i < SIZE_OF_BUCKET; i++) {
            buckets.add(i, new Bucket());
        }
        init();
    }

    private void init() {
        this.strategy.init(SIZE_OF_BUCKET);
    }

    class Bucket {
        List<Entry> entries = new LinkedList<>();

        public Entry get(K key) {
            for (Entry entry : entries) {
                if (entry.key.equals(key)) {
                    return entry;
                }
            }
            return null;
        }

        public void add(Entry entry) {
            Entry existingEntry = get(entry.key);
            if (existingEntry != null) {
                entries.remove(existingEntry);
            }
            entries.add(entry);
        }
    }

    class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public void put(K key, V value) {
        Entry entry = new Entry(key, value);
        int bucketIndex = strategy.getBucket(key);
        if (bucketIndex < 0 || bucketIndex > SIZE_OF_BUCKET) {
            throw new IndexOutOfBoundsException();
        }
        Bucket matchingBucket = buckets.get(bucketIndex);
        matchingBucket.add(entry);
    }

    @Override
    public V get(K key) {
        int bucketIndex = strategy.getBucket(key);
        if (bucketIndex < 0 || bucketIndex > SIZE_OF_BUCKET) {
            throw new IndexOutOfBoundsException();
        }
        Bucket matchingBucket = buckets.get(bucketIndex);
        return matchingBucket.get(key).value;
    }
}
