package com.barbaro.webmvcapp.dao;

import com.barbaro.webmvcapp.domain.Student;
import com.barbaro.webmvcapp.dto.StudentDto;

import java.util.List;

public interface StudentDao {
    void save(StudentDto student);
    Student findById(Integer primaryKey);
    List<Student> findAll();
    long count();
    //void delete(StudentDto student);
    //boolean existById(Integer primaryKey);
}
