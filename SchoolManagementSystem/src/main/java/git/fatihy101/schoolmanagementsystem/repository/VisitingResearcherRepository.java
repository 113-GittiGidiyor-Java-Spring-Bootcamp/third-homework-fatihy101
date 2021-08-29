package git.fatihy101.schoolmanagementsystem.repository;

import git.fatihy101.schoolmanagementsystem.entity.VisitingResearcher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitingResearcherRepository extends CrudRepository<VisitingResearcher, Integer> {
    List<VisitingResearcher> findAll();
    VisitingResearcher findById(int id);
    List<VisitingResearcher> findAllByName(String name);

    void deleteByName(String name);
    void deleteById(int id);
}