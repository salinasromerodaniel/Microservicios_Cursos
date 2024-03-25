package com.microservice.course.service;

import java.util.List;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

public interface ICourseService {

    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);

    //desde cursos debemos hacer una petición a estudiantes para consultar los estudiantes
    StudentByCourseResponse findAllStudentByCourse(Long idCourse);
}
