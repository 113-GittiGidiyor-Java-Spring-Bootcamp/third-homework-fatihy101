package git.fatihy101.schoolmanagementsystem.controller;

import git.fatihy101.schoolmanagementsystem.entity.PermanentInstructor;
import git.fatihy101.schoolmanagementsystem.repository.PermanentInstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/permanent_instructors")
public class PermanentInstructorController implements InstructorBaseController<PermanentInstructor> {
    private final PermanentInstructorRepository repository;

    @GetMapping("/")
    @Override
    public ResponseEntity<List<PermanentInstructor>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<PermanentInstructor>> findAllByName(@PathVariable String name) {
        return ResponseEntity.ok(repository.findAllByName(name));
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<PermanentInstructor> findById(@PathVariable int id) {
        return ResponseEntity.ok(repository.findById(id));
    }

    @PostMapping("/")
    @Override
    public ResponseEntity<PermanentInstructor> save(PermanentInstructor object) {
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
        repository.deleteByName(name);
    }

    @GetMapping("/top_paid")
    @Override
    public ResponseEntity<List<PermanentInstructor>> getTopPaid() {
        return null;
    }

    @GetMapping("/lowest_paid")
    @Override
    public ResponseEntity<List<PermanentInstructor>> getLowestPaid() {
        return null;
    }
}
