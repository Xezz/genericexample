package de.xezzco.generics.repo;

public interface WriteOnlyRepository<T> {
    void writeItem(T item);
}
