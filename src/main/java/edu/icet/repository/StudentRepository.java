package edu.icet.repository;

import edu.icet.Dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Integer>{
}
