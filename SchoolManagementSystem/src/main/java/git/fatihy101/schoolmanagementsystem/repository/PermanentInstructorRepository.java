package git.fatihy101.schoolmanagementsystem.repository;

import git.fatihy101.schoolmanagementsystem.entity.PermanentInstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermanentInstructorRepository extends CrudRepository<PermanentInstructor, Integer> {
    List<PermanentInstructor> findAll();
    PermanentInstructor findById(int id);
    List<PermanentInstructor> findAllByName(String name);
    List<PermanentInstructor> findTop3ByFixedSalary(double fixedSalary); // TODO write a custom query

    void deleteByName(String name);
    void deleteById(int id);
}