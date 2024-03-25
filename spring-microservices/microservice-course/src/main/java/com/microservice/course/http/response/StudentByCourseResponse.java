package com.microservice.course.http.response;

import java.util.List;

import com.microservice.course.dto.StudentDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Clase que va a mappear la respuesta que nosotros le vamos a dar a la persona que está consultando 
//nuestro microservicio
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;
}
