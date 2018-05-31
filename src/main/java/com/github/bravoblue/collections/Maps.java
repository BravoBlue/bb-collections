package com.github.bravoblue.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.github.bravoblue.types.Tuple;

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
    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        map.put(k4,v4);
        map.put(k5,v5);
        map.put(k6,v6);
        return Collections.unmodifiableMap(map);
    }
    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        map.put(k4,v4);
        map.put(k5,v5);
        map.put(k6,v6);
        map.put(k7,v7);
        return Collections.unmodifiableMap(map);
    }
    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        map.put(k4,v4);
        map.put(k5,v5);
        map.put(k6,v6);
        map.put(k7,v7);
        map.put(k8,v8);
        return Collections.unmodifiableMap(map);
    }
    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        map.put(k4,v4);
        map.put(k5,v5);
        map.put(k6,v6);
        map.put(k7,v7);
        map.put(k8,v8);
        map.put(k9,v9);
        return Collections.unmodifiableMap(map);
    }
    public static <K,V> Map<K,V> of​(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        Map<K,V> map = new HashMap<>();
        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        map.put(k4,v4);
        map.put(k5,v5);
        map.put(k6,v6);
        map.put(k7,v7);
        map.put(k8,v8);
        map.put(k9,v9);
        map.put(k10,v10);
        return Collections.unmodifiableMap(map);
    }

    public static <K,V> Map<K,V> ofEntries​(Map.Entry<? extends K,? extends V>... entries) {
        Map<K,V> map= new HashMap<>();
        for (Map.Entry<? extends K,? extends V> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return Collections.unmodifiableMap(map);
    }

    public static <K,V> Map<K,V> copyOf(Map<K,V> input) {
        Map<K,V> map= new HashMap<>(input);
        return Collections.unmodifiableMap(map);
    }

    public static <K,V> List<Tuple<K,V>> toTuples(Map<K,V> input) {
        List<Tuple<K,V>> tupleList= input.entrySet().stream()
            .map(entry -> Tuple.of(entry.getKey(), entry.getValue()))
            .collect(Collectors.toList());
        return Collections.unmodifiableList(tupleList);
    }


}
