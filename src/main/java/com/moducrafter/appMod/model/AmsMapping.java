package com.moducrafter.appMod.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "AMS_MAPPING")
@Setter
@Getter
public class AmsMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mappingId;
    @OneToOne
    @JoinColumn(name = "EMP_ID", referencedColumnName = "EMP_ID")
    private Employee empId;
    @ManyToOne
    @JoinColumn(name = "SUPERVISOR_ID", referencedColumnName = "EMP_ID")
    private Employee supervisorId;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "UPDATED_TS")
    private LocalDateTime updatedTs;
}
