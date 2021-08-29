package git.fatihy101.schoolmanagementsystem.controller;


import git.fatihy101.schoolmanagementsystem.entity.Student;
import git.fatihy101.schoolmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController implements BaseController<Student> {
    private final StudentService service;

    @GetMapping("/")
    @Override
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Student>> findAllByName(@PathVariable String name) {
        return ResponseEntity.ok(service.findAllByName(name));
    }

    @GetMapping("/gender/{gender}")
    public ResponseEntity<List<Student>> findAllByGender(@PathVariable String gender) {
        return ResponseEntity.ok(service.findAllByGender(gender));
    }

    @GetMapping("/count_grouped_by_gender")
    public ResponseEntity<?> getStudentCountGroupedByGender() { // FIXME
        return ResponseEntity.ok(service.getStudentCountGroupedByGender());
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Student> findById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/")
    @Override
    public ResponseEntity<Student> save(Student object) {
        return ResponseEntity.ok(service.save(object));
    }

    @DeleteMapping("/id/{id}")
    @Override
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }

    @DeleteMapping("/name/{name}")
    @Override
    public void deleteByName(@PathVariable String name) {
        service.deleteByName(name);
    }
}
