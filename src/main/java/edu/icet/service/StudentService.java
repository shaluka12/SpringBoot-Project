package edu.icet.service;

import edu.icet.Dto.Student;

import java.util.List;

public interface StudentService {

    void add(String data);



    List<Student> getStudent();

     void addStudent(Student student);

     void deleteStudentById(Integer id);

     void UpdateStudent(Student student);

    List<Student> findByName(String name);
}
