package com.throyer.swing.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import static java.time.format.DateTimeFormatter.ofPattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
