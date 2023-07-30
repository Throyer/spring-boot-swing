package com.throyer.swing.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import static java.time.format.DateTimeFormatter.ofPattern;

@Table(name = "patient")
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "sex")
    private String sex;
    
    @Column(name = "birth")
    private LocalDateTime birth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    public Patient() {
    }

    public Patient(String name, String phone, String sex, LocalDateTime birth) {
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.birth = birth;
    }
    
    public Object[] getPatientData() {
        return new Object[]{
            this.name,
            this.phone,
            this.sex,
            this.birth.format(ofPattern("dd/MM/yyyy"))
        };
    }

    @Override
    public String toString() {
        return this.name;
    }
}
