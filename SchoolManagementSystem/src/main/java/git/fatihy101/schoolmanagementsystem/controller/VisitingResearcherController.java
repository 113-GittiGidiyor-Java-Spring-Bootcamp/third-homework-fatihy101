package git.fatihy101.schoolmanagementsystem.controller;

import git.fatihy101.schoolmanagementsystem.entity.VisitingResearcher;
import git.fatihy101.schoolmanagementsystem.repository.VisitingResearcherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/visiting_researchers")
public class VisitingResearcherController implements BaseController<VisitingResearcher> {
    private final VisitingResearcherRepository repository;

    @GetMapping("/")
    @Override
    public ResponseEntity<List<VisitingResearcher>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<VisitingResearcher>> findAllByName(@PathVariable String name) {
        return ResponseEntity.ok(repository.findAllByName(name));
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<VisitingResearcher> findById(@PathVariable int id) {
        return ResponseEntity.ok(repository.findById(id));
    }

    @PostMapping("/")
    @Override
    public ResponseEntity<VisitingResearcher> save(VisitingResearcher object) {
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
}