package com.example.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

abstract public class memoryDBRepositoryAbstract<T extends MemoryDBEntity> implements memoryDBRepositoryIfs<T>{

    private final List<T> db = new ArrayList<>();
    private int index = 0;
    @Override
    public Optional<T> findById(int index) {
        return db.stream().filter(it -> it.getIndex() == index).findFirst();
    }

    @Override
    public T save(T entity) {
        Optional<T> optionalEntity = db.stream().filter(it -> it.getIndex() == entity.getIndex()).findFirst();
        //db에 데이터가 이미 있는 경우
        if (optionalEntity.isEmpty()){
            index ++;
            entity.setIndex(index);
            db.add(entity);

        }
        //db에 데이터가 없는 경우
        if (!optionalEntity.isEmpty()){
            int preIndex = optionalEntity.get().getIndex();
            entity.setIndex(preIndex);
            deleteById(preIndex);
        }
        return entity;
    }

    @Override
    public void deleteById(int index) {
        var optionalEntity = db.stream().filter(it -> it.getIndex() == index).findFirst();
        if(optionalEntity.isPresent()){
        db.remove(optionalEntity.get());
        }
    }

    @Override
    public List<T> listAll() {
        return db;
    }
}
