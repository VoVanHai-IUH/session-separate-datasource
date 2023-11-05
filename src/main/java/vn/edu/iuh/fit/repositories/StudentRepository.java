package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.models.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
