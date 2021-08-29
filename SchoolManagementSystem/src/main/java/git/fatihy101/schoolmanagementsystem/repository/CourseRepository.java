package git.fatihy101.schoolmanagementsystem.repository;

import git.fatihy101.schoolmanagementsystem.entity.Course;
import git.fatihy101.schoolmanagementsystem.entity.PermanentInstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
    List<Course> findAll();
    Course findById(int id);
    Course findByCourseCode(String code);

    void deleteByCourseName(String name);
    void deleteByCourseCode(String code);
    void deleteById(int id);
}