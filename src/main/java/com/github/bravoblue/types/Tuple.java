package com.github.bravoblue.types;

import java.util.List;

import com.github.bravoblue.collections.Lists;

public class Tuple<X, Y> {

    public final X x;
    public final Y y;

    private Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public static <X,Y> Tuple<X, Y> of (X x1, Y y1) {
        return new Tuple<>(x1, y1);
    }

    public static <X,Y> List<Tuple<X,Y>> of (X x1, Y y1, X x2, Y y2) {
        return Lists.of(Tuple.of(x1,y1), Tuple.of(x2,y2));
    }

    public X fst() {
        return x;
    }

    public Y snd() {
        return y;
    }

    public Tuple<Y,X> swap() {
        return Tuple.of(this.y, this.x);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
