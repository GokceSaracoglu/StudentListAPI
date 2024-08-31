package com.saracoglu.students.services;

import com.saracoglu.students.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();
    public StudentService(){
       students.add(new Student("gökçe", 23 ));
       students.add(new Student("hasan", 24 ));
       students.add(new Student("okan", 25 ));
       students.add(new Student("mete", 27));
    }
    public List<Student> getAllStudents(){
        return students;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void removeStudent (Student student)
    {
        students.remove(student);
    }

}
