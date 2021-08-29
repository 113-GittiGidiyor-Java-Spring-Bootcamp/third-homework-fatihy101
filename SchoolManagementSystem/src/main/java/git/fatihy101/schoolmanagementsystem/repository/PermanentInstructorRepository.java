package git.fatihy101.schoolmanagementsystem.repository;

import git.fatihy101.schoolmanagementsystem.entity.PermanentInstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermanentInstructorRepository extends CrudRepository<PermanentInstructor, Integer> {
    List<PermanentInstructor> findAll();
    PermanentInstructor findById(int id);
    List<PermanentInstructor> findAllByName(String name);

    @Query("select max(p.fixedSalary) from PermanentInstructor p order by p.fixedSalary desc")
    List<PermanentInstructor> findTopByFixedSalary();
    @Query("select min(p.fixedSalary) from PermanentInstructor p order by p.fixedSalary desc")
    List<PermanentInstructor> findMinByFixedSalary();

    void deleteByName(String name);
    void deleteById(int id);
}