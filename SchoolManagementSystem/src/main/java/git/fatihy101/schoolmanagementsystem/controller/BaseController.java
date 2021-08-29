package git.fatihy101.schoolmanagementsystem.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController<T> {
    ResponseEntity<List<T>> findAll();
    ResponseEntity<T> findById(int id);
    ResponseEntity<T> save(T object);
    void deleteById(int id);
    void deleteByName(String name);
}
