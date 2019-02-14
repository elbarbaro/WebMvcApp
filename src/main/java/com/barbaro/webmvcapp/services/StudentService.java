package com.barbaro.webmvcapp.services;

import com.barbaro.webmvcapp.domain.Student;
import com.barbaro.webmvcapp.dto.StudentDto;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDto student);
    Student getStudentById(Integer id);
    List<Student> getAllStudents();
    long count();
}
