package com.barbaro.webmvcapp.services;


import com.barbaro.webmvcapp.dao.StudentDao;
import com.barbaro.webmvcapp.domain.Student;
import com.barbaro.webmvcapp.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void addStudent(StudentDto student) {
        studentDao.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentDao.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    @Override
    public long count() {
        return studentDao.count();
    }
}
