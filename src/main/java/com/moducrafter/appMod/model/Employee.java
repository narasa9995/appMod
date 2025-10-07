package com.moducrafter.appMod.model;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private int empId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DOJ")
    private LocalDate dateOfJoining;

    @Column(name = "TECH_STACK")
    private String techStack;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "RESUME")
    private byte[] resume;

    @Column(name = "INSERT_TS")
    @Timestamp
    private LocalDateTime timeStamp;



}
