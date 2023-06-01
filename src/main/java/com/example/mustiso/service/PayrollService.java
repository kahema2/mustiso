package com.example.mustiso.service;

import com.example.mustiso.entity.Payroll;

import java.util.List;

public interface PayrollService {

    //Create
    Payroll addPayroll(Payroll payroll);
    //get all Payroll
    List<Payroll> getAllPayroll();
    //get Payroll By id
    Payroll getPayrollById(Long id);
    //update
    Payroll updatePayroll(Long id, Payroll payroll);
    //delete
    void deletePayroll(Long id);
}
