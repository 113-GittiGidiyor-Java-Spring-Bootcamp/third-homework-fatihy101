package git.fatihy101.schoolmanagementsystem.controller;

import git.fatihy101.schoolmanagementsystem.entity.Course;
import git.fatihy101.schoolmanagementsystem.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/courses")
public class CourseController implements BaseController<Course> {
    private final CourseRepository repository;

    @GetMapping("/")
    @Override
    public ResponseEntity<List<Course>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Course> findById(@PathVariable int id) {
        return ResponseEntity.ok(repository.findById(id));
    }

    @PostMapping("/")
    @Override
    public ResponseEntity<Course> save(Course object) {
        return ResponseEntity.ok(repository.save(object));
    }

    @DeleteMapping("/id/{id}")
    @Override
    public void deleteById(@PathVariable int id) {
        repository.deleteById(id);
    }

    @DeleteMapping("/name/{name}")
    @Override
    public void deleteByName(@PathVariable String name) {
        repository.deleteByCourseName(name);
    }
}