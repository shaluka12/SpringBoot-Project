package edu.icet.controll;

import edu.icet.Dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping
    public List<Student> getstudent(){
        return  service.getStudent();
    }
    @PostMapping
    public void addStudent(@RequestBody Student student) {
        service.addStudent(student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){
            service.deleteStudentById(id);
        }
    @PutMapping
    public void  UpdateStudent(@RequestBody Student student){
        service.addStudent(student);
    }
    @GetMapping("/find-by-name/{name}")
    public List<Student> findByName(@PathVariable String name){
        return service.findByName(name);
    }
}

