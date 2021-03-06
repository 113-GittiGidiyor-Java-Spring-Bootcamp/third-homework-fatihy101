package git.fatihy101.schoolmanagementsystem.service;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    T findById(int id);
    T save(T object);
    void deleteById(int id);
}
