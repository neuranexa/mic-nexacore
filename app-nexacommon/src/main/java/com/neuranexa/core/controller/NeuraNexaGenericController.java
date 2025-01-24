package com.neuranexa.core.controller;

import com.neuranexa.core.service.NeuraNexaGenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class NeuraNexaGenericController<T, K> {

    private final NeuraNexaGenericService<T, K> service;

    protected NeuraNexaGenericController(NeuraNexaGenericService<T, K> service) {
        this.service = service;
    }

    @GetMapping
    public List<T> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<T> getById(@PathVariable K id) {
        return service.findById(id);
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public T update(@PathVariable K id, @RequestBody T entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable K id) {
        service.deleteById(id);
    }
}
