package git.fatihy101.schoolmanagementsystem.controller;

import git.fatihy101.schoolmanagementsystem.entity.Instructor;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InstructorBaseController<T> extends BaseController<T> {
    ResponseEntity<List<T>> getTopPaid();
    ResponseEntity<List<T>> getLowestPaid();


}
