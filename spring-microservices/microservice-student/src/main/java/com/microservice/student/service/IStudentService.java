package com.microservice.student.service;

import java.util.List;

import com.microservice.student.entities.Student;

public interface IStudentService {

    List<Student> findAll();
    Student findById(Long id);
    List<Student> findByIdCourse(Long idCourse);
    void save(Student student);
    
}
