package com.megames_backend.store;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractService<T, ID> {

    protected final JpaRepository<T, ID> repository;

    public AbstractService(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    public List<T> getAll() {
        return repository.findAll();
    }

    public T getById(ID id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("No entity with id " + id)
        );
    }

    public T add(T entity) {
        return repository.save(entity);
    }

    public abstract T update(T entity, ID id);

    public void delete(ID id) {
        repository.deleteById(id);
    }
}
