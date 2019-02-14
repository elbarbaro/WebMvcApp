package com.barbaro.webmvcapp.dto;

public class StudentDto {

    private String code;
    private String apePaterno;
    private String apeMaterno;
    private String name;
    private String birthDate;

    public StudentDto(String code, String apePaterno, String apeMaterno, String name, String birthDate) {
        this.code = code;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.name = name;
        this.birthDate = birthDate;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
