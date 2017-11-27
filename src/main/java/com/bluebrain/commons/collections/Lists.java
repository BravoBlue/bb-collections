package com.bluebrain.commons.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists {

    private Lists() {}

    public static final <E> List<E> empty() { return of(); }

    public static final <E> List<E> of() { return Collections.emptyList(); }

    public static final <E> List<E> of(E a) {
        return Collections.singletonList(a);
    }

    public static final <E> List<E> of(E e1, E e2) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(E e1, E e2, E e3) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(E e1, E e2, E e3, E e4) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(E e1, E e2, E e3, E e4, E e5) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        List<E> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);
        return Collections.unmodifiableList(list);
    }

    public static <E> List<E> of​(E... elements) {
        List<E> list = Arrays.asList(elements);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> of(Collection<E> col) {
        List<E> list = new ArrayList<>();
        list.addAll(col);
        return Collections.unmodifiableList(list);
    }

    public static final <E> List<E> add(List<E> list, E element) {
        List<E> newList = new ArrayList<>();
        newList.addAll(list);
        newList.add(element);
        return Collections.unmodifiableList(newList);
    }

}
