package com.moducrafter.appMod.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "INTERVIEW_DETAILS")
public class InterviewDetails {
    @Id
    @Column(name = "INTERVIEW_ID")
    private int interviewId;
    @Column(name = "EMP_ID")
    @ManyToOne
    @JoinColumn(name = "EMP_ID", referencedColumnName = "EMP_ID")
    private int empId;
    @Column(name = "INTERVIEW_DATE")
    private String interviewDate;
    @Column(name = "CLIENT_NAME")
    private String clientName;
    @Column(name = "FEEDBACK")
    private String feedback;
    @Column(name = "RESULT")
    private String result;
    @Column(name = "CREATED_BY")
    private LocalDateTime lastUpdatedTs;
}
