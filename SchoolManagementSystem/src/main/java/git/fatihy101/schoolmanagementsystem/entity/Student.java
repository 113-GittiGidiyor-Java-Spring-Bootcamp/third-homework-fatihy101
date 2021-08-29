package git.fatihy101.schoolmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "student")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name, address, gender;
    private LocalDate BirthDate;

    @JoinTable(name = "STUDENT_COURSE",
            joinColumns = @JoinColumn(name = "null"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_id"))
    @ManyToMany(mappedBy = "studentList")
    private List<Course> courseList = new ArrayList<>();

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}
