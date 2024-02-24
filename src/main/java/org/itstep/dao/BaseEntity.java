package org.itstep.dao;

import java.util.List;

public interface BaseEntity<T, Id> {

    void save(T t);

    void update(T t);

    void delete(Id id);

    List<T> getAll();

    T getById(Id id);

}
