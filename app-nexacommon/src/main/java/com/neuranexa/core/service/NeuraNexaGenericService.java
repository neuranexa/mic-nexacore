package com.neuranexa.core.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class NeuraNexaGenericService<T, K> {

    private final JpaRepository<T, K> repository;

    protected NeuraNexaGenericService(JpaRepository<T, K> repository) {
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<T> findById(K id) {
        return repository.findById(id);
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public void deleteById(K id) {
        repository.deleteById(id);
    }
}
