package com.zrs.custom.collections;

/**
 * @author zrs
 */
public interface BucketStrategy {

    void init(int bucketSize);

    int getBucket(Object o);
}
