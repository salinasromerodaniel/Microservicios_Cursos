package com.microservice.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDTO;
import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.persistence.ICourseRepository;

@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    private ICourseRepository courseRepository;

    //para acceder a los métodos de el servicio student primero debes declarar el cliente
    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    //método que hace la petición al microservicio student para consultar los estudiantes
    //se debe colocar en el controller un endpoint para que pueda recibir peticiones a este método
    @Override
    public StudentByCourseResponse findAllStudentByCourse(Long idCourse) {
        //consultar el curso
        Course course = courseRepository.findById(idCourse).orElse(new Course());

        //obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(idCourse);
        return StudentByCourseResponse.builder()
        .courseName(course.getName())
        .teacher(course.getTeacher())
        .studentDTOList(studentDTOList)
        .build();
    }

}
