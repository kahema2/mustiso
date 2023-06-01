package com.example.mustiso.controller;

import com.example.mustiso.entity.Payroll;
import com.example.mustiso.service.PayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kahema/payroll")
public class PayrollController {
    private PayrollService payrollService;

    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }
    //Create
    @PostMapping
    public ResponseEntity<Payroll> addPayRoll(@RequestBody Payroll payroll){
        return new ResponseEntity<>(payrollService.addPayroll(payroll), HttpStatus.CREATED);
    }
    //Get All
    @GetMapping
    public List<Payroll> getAllPayroll(){
        return payrollService.getAllPayroll();
    }
    //Get by id
    public ResponseEntity<Payroll> getPayrollById(@PathVariable Long id){
        return new ResponseEntity<>(payrollService.getPayrollById(id), HttpStatus.OK);
    }
    //Update
    @PutMapping
    public ResponseEntity<Payroll> updatePayroll(@PathVariable Long id, @RequestBody Payroll payroll ){
        return new ResponseEntity<>(payrollService.updatePayroll(id, payroll), HttpStatus.OK);
    }
    //delete
    @DeleteMapping("{id}")
    public ResponseEntity<String>deletePayroll(@PathVariable Long id){
        return new ResponseEntity<>("deleted",HttpStatus.OK);
    }
}
