package git.fatihy101.schoolmanagementsystem.controller;

import git.fatihy101.schoolmanagementsystem.entity.PermanentInstructor;
import git.fatihy101.schoolmanagementsystem.repository.PermanentInstructorRepository;
import git.fatihy101.schoolmanagementsystem.service.PermanentInstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/permanent_instructors")
public class PermanentInstructorController implements InstructorBaseController<PermanentInstructor> {
    private final PermanentInstructorService service;

    @GetMapping("/")
    @Override
    public ResponseEntity<List<PermanentInstructor>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<PermanentInstructor>> findAllByName(@PathVariable String name) {
        return ResponseEntity.ok(service.findAllByName(name));
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<PermanentInstructor> findById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/")
    @Override
    public ResponseEntity<PermanentInstructor> save(PermanentInstructor object) {
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

    @GetMapping("/top_paid")
    @Override
    public ResponseEntity<List<PermanentInstructor>> getTopPaid() {
        return ResponseEntity.ok(service.findTop3ByFixedSalary());
    }

    @GetMapping("/lowest_paid")
    @Override
    public ResponseEntity<List<PermanentInstructor>> getLowestPaid() {
        return ResponseEntity.ok(service.findMin3ByFixedSalary());
    }
}
