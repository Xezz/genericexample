package de.xezzco.generics.repo;

public class RepoImpl implements Repository<Integer>{
    @Override
    public Integer getItem() {
        return 1;
    }

    @Override
    public void writeItem(Integer item) {

    }
}
