package git.fatihy101.schoolmanagementsystem.controller;

import git.fatihy101.schoolmanagementsystem.entity.Course;
import git.fatihy101.schoolmanagementsystem.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/courses")
public class CourseController implements BaseController<Course> {
    private final CourseService service;

    @GetMapping("/")
    @Override
    public ResponseEntity<List<Course>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Course> findById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/code/{code}")
    public ResponseEntity<Course> findByCourseCode(@PathVariable String code) {
        return ResponseEntity.ok(service.findByCourseCode(code));
    }

    @PostMapping("/")
    @Override
    public ResponseEntity<Course> save(Course object) {
        return ResponseEntity.ok(service.save(object));
    }

    @DeleteMapping("/id/{id}")
    @Override
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }

    @DeleteMapping("/code/{code}")
    public void deleteByCourseCode(@PathVariable String code) {
        service.deleteByCourseCode(code);
    }


    @DeleteMapping("/name/{name}")
    @Override
    public void deleteByName(@PathVariable String name) {
        service.deleteByName(name);
    }
}