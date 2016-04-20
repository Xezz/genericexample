package de.xezzco.generics;

import java.util.List;

public interface Base<T> {
    T returnValueAsIs(T item);

    List<T> getList(T item);

    void doSomething(List<T> list);
}
