package com.megames_backend.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController<T, ID> {

    protected final AbstractService<T, ID> service;

    @Autowired
    public AbstractController(AbstractService<T, ID> service) {
        this.service = service;
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<T>> getAll() {
        List<T> entities = service.getAll();
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<T> getById(@PathVariable ID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<T> add(@RequestBody T entity) {
        return new ResponseEntity<>(service.add(entity), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<T> update(@RequestBody T entity, @PathVariable ID id) {
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ID id) {
        service.delete(id);
    }
}
