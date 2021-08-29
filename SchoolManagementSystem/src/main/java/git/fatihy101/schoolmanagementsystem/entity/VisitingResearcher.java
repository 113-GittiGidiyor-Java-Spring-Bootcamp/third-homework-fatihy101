package git.fatihy101.schoolmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "visiting_researcher")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitingResearcher extends Instructor {
    private double hourlySalary;

}