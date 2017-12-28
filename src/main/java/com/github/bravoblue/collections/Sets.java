package com.github.bravoblue.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    private Sets() {}

    public static final <E> Set<E> empty() {
        return of();
    }

    public static final <E> Set<E> of() {
        return Collections.emptySet();
    }

    public static final <E> Set<E> of(E a) {
        return Collections.singleton(a);
    }

    public static final <E> Set<E> of(E e1, E e2) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(E e1, E e2, E e3) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(E e1, E e2, E e3, E e4) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(E e1, E e2, E e3, E e4, E e5) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        set.add(e7);
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        set.add(e7);
        set.add(e8);
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        set.add(e7);
        set.add(e8);
        set.add(e9);
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        Set<E> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        set.add(e7);
        set.add(e8);
        set.add(e9);
        set.add(e10);
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> of​(E... elements) {
        Set<E> set = new HashSet<>();
        set.addAll(Arrays.asList(elements));
        return Collections.unmodifiableSet(set);
    }

    public static final <E> Set<E> of(Collection<E> col) {
        Set<E> set = new HashSet<>();
        set.addAll(col);
        return Collections.unmodifiableSet(set);
    }

}
