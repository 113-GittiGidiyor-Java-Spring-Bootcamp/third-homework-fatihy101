package git.fatihy101.schoolmanagementsystem.repository;

import git.fatihy101.schoolmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    List<Student> findAll();
    Student findById(int id);
    List<Student> findAllByName(String name);
    List<Student> findAllByGender(String gender);

    @Query("select e.gender, count(e.gender) from Student e GROUP BY e.gender")
    List<?> getStudentCountGroupedByGender();
    // @Param("gender") String gender Fixme

    void deleteByName(String name);
    void deleteById(int id);


}