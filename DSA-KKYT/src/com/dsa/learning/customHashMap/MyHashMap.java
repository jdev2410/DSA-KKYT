package com.dsa.learning.customHashMap;

// Steps to create our own HashMap class.
// Create a class called MyHashMap
// Create one more private static Entry class of generic type<K,V> inside MyHashMap class
// This Entry will act as a linkedList class.
// Define K, V and next pointer.
// Create constructor of Entry class with k and v as an argument.
// Define final initial capacity(INITIAL_CAPACITY) in MyHashMap class
// Define Buckets of hashmap private Entry<K,V>[] buckets;
//

import java.util.Objects;

public class MyHashMap<K, V> {

    private static class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    private final int INITIAL_CAPACITY = 16;
    private Entry<K, V>[] buckets;

    public MyHashMap() {// Initialize the initial capacity of the map.
        buckets = new Entry[INITIAL_CAPACITY];
    }

    private int getBucketIndex(K key) {// Get bucket index
        int hashCodeOfKey = key.hashCode();
        return hashCodeOfKey % buckets.length;
    }

    public V getValue(K key) {// Get value for given key, if present.
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> bucket = buckets[bucketIndex];
        while (Objects.nonNull(bucket)) {
            if (bucket.key.equals(key))
                return bucket.value;
            bucket = bucket.next;
        }
        return null;
    }

    public boolean containsKey(K key) {
        return getValue(key) != null;// Check if key is present in the map of not
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key))// Here if key is already present in the map then update the value.
            {
                head.value = value;
                return;
            }
            head = head.next;

        }
        Entry<K, V> entry = new Entry<>(key, value);
        entry.next=buckets[bucketIndex];
        buckets[bucketIndex]=entry;
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map= new MyHashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);
        map.put("G",7);
        map.put("H",8);
        map.put("I",9);
        map.put("J",10);
        map.put("K",11);
        map.put("L",12);
        map.put("M",13);
        map.put("N",14);
        map.put("O",15);
        map.put("P",16);
        map.put("Q",17);

        Integer a = map.getValue("O");
        System.out.println(a);
    }

}
