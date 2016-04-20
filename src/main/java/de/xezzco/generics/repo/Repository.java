package de.xezzco.generics.repo;

public interface Repository<T> extends WriteOnlyRepository<T>, ReadOnlyRepository<T> {
}
