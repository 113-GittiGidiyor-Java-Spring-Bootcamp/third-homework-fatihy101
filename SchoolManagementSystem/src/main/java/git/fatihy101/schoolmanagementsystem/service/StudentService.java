package git.fatihy101.schoolmanagementsystem.service;

import git.fatihy101.schoolmanagementsystem.entity.Student;
import git.fatihy101.schoolmanagementsystem.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements BaseService<Student> {

    private final StudentRepository repository;

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student findById(int id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Student save(Student object) {
        return repository.save(object);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public List<Student> findAllByName(String name) {
        return repository.findAllByName(name);
    }

    public List<Student> findAllByGender(String gender) {
        return repository.findAllByGender(gender);
    }

    public List<?> getStudentCountGroupedByGender() {
        return repository.getStudentCountGroupedByGender();
    }

    @Transactional
    public void deleteByName(String name) {
        repository.deleteByName(name);
    }
}
