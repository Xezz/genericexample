package de.xezzco.generics.repo;

public interface ReadOnlyRepository<T> {
    T getItem();
}
