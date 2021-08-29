package git.fatihy101.schoolmanagementsystem.service;

import git.fatihy101.schoolmanagementsystem.entity.Course;
import git.fatihy101.schoolmanagementsystem.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService implements BaseService<Course> {

    private final CourseRepository repository;

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Course findById(int id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Course save(Course object) {
        return repository.save(object);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public Course findByCourseCode(String code) {
        return repository.findByCourseCode(code);
    }

    public void deleteByCourseCode(String code) {
        repository.deleteByCourseCode(code);
    }

    @Transactional
    public void deleteByName(String name) {
        repository.deleteByCourseName(name);
    }

}
