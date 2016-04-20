package de.xezzco.generics.impl;

import de.xezzco.generics.Base;

import java.util.ArrayList;
import java.util.List;

public class BaseImpl<T> implements Base<T> {
    @Override
    public T returnValueAsIs(T item) {
        return item;
    }

    @Override
    public List<T> getList(T item) {
        List<T> result = new ArrayList<>();
        result.add(item);

        return result;
    }

    @Override
    public void doSomething(List<T> list) {
        return;
    }
}
