package com.nut.CycleManagement.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface BaseService<T> {
    Page<T> findAll(Pageable page);

    Optional<T> findById(int id);

    T update(T t);

    void delete(int id);
}
