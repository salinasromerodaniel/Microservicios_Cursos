package com.microservice.course.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/* 
 * DTO (Data Transfer Object) es un patrón de diseño que se utiliza para transferir datos 
 * entre diferentes componentes de un sistema, como capas de aplicación, servicios web, o 
 * entre sistemas distribuidos. Un DTO es una clase simple que generalmente contiene solo datos, 
 * sin lógica de negocio ni comportamiento. Su principal objetivo es transportar datos entre diferentes 
 * partes del sistema de manera eficiente.
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//básicamente StudentDTO se queda como una representación de un objeto Student de el servicio Student
public class StudentDTO {

    //básicamente copiamos todos los atributos de Student menos el ID, también quitamos el column
    private String name;
    private String lastName;
    private String email;
    private Long courseId;
}
