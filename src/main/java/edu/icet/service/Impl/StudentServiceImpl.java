package edu.icet.service.Impl;

import edu.icet.Dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class StudentServiceImpl implements StudentService {
   @Autowired
   StudentRepository repository;

    @Override
     public void add(String data) {

    }

    @Override
    public List<Student> getStudent() {
        List<Student> all = repository.findAll();
        return  all;
    }

    @Override
    public void addStudent(Student student) {
          repository.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void UpdateStudent(Student student) {
        repository.save(student);
    }
}

