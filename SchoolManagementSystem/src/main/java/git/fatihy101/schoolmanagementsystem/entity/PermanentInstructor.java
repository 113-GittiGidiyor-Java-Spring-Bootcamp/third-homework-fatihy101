package git.fatihy101.schoolmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "permanent_instructor")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermanentInstructor extends Instructor {
    private double fixedSalary;
}