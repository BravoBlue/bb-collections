package com.github.bravoblue.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Maps {

    private Maps() {}

    public static <K,V> Map<K,V> empty() {
        return of​();
    }

    public static <K,V> Map<K,V> of​() {
        return Collections.emptyMap();
    }

    public static <K,V> Map<K,V> of​(K k1, V v1) {
        return Collections.singletonMap(k1, v1);
    }

    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        return Collections.unmodifiableMap(map);
    }

    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        return Collections.unmodifiableMap(map);
    }

    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        map.put(k4,v4);
        return Collections.unmodifiableMap(map);
    }
    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        map.put(k4,v4);
        map.put(k5,v5);
        return Collections.unmodifiableMap(map);
    }
//    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6)
//    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7)
//    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8)
//    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9)
//    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10)

}
