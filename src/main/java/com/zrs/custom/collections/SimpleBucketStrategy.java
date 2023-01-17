package com.zrs.custom.collections;

/**
 * @author zrs
 */
public class SimpleBucketStrategy implements BucketStrategy {

    int bucketSize = -1;

    @Override
    public void init(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    @Override
    public int getBucket(Object o) {
        int hashCode = o.hashCode();
        return hashCode % bucketSize;
    }
}
