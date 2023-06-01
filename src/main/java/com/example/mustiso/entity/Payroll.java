package com.example.mustiso.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Payroll")
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "PayrollId")
    int PayrollId;
    @Column(name = "PayrollName")
    String PayrollName;
    @Column(name = "PayrollAmount")
    String PayrollAmount;
}
