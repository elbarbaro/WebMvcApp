package com.barbaro.webmvcapp.controller;

import com.barbaro.webmvcapp.dao.StudentDao;
import com.barbaro.webmvcapp.dto.StudentDto;
import com.barbaro.webmvcapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String students(){
        return "students";
    }

    @PostMapping("/create")
    public String createStudent(ModelMap modelMap, StudentDto studentDto){
        String tempData = "code: " + studentDto.getCode() + "," +
                "apePaterno: " + studentDto.getApePaterno() + ", " +
                "apeMaterno: " + studentDto.getApeMaterno() + ", " +
                "name: " + studentDto.getName() + ", " +
                "birthDate: " + studentDto.getBirthDate();
        modelMap.addAttribute("student", tempData);
        studentService.addStudent(studentDto);
        return "students";
    }
}
