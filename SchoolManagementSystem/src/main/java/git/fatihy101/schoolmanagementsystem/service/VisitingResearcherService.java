package git.fatihy101.schoolmanagementsystem.service;

import git.fatihy101.schoolmanagementsystem.entity.VisitingResearcher;
import git.fatihy101.schoolmanagementsystem.repository.VisitingResearcherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitingResearcherService implements BaseService<VisitingResearcher> {

    private final VisitingResearcherRepository repository;

    @Override
    public List<VisitingResearcher> findAll() {
        return repository.findAll();
    }

    @Override
    public VisitingResearcher findById(int id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public VisitingResearcher save(VisitingResearcher object) {
        return repository.save(object);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public List<VisitingResearcher> findAllByName(String name) {
        return repository.findAllByName(name);
    }

    public void deleteByName(String name) {
        repository.deleteByName(name);
    }

}
