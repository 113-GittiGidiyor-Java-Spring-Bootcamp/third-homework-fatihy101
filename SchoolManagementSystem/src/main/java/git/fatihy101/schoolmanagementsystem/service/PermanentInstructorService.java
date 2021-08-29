package git.fatihy101.schoolmanagementsystem.service;

import git.fatihy101.schoolmanagementsystem.entity.PermanentInstructor;
import git.fatihy101.schoolmanagementsystem.repository.PermanentInstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermanentInstructorService implements BaseService<PermanentInstructor> {

    private final PermanentInstructorRepository repository;

    @Override
    public List<PermanentInstructor> findAll() {
        return repository.findAll();
    }

    @Override
    public PermanentInstructor findById(int id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public PermanentInstructor save(PermanentInstructor object) {
        return repository.save(object);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public List<PermanentInstructor> findTop3ByFixedSalary() {
        return repository.findTopByFixedSalary();
    }

    public List<PermanentInstructor> findMin3ByFixedSalary() {
        return repository.findMinByFixedSalary();
    }

    public List<PermanentInstructor> findAllByName(String name) {
        return repository.findAllByName(name);
    }

    public void deleteByName(String name) {
        repository.deleteByName(name);
    }

}