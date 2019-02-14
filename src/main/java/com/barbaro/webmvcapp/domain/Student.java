package com.barbaro.webmvcapp.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alumno")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alu")
    private Integer id;

    @Column(name = "cod_alu")
    private String code;

    @Column(name = "ape_paterno")
    private String apePaterno;

    @Column(name = "ape_materno")
    private String apeMaterno;

    @Column(name = "nombre")
    private String name;

    @Column(name = "fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    public Student() {
    }

    public Student(String code, String apePaterno, String apeMaterno, String name, Date birthDate) {
        this.code = code;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
