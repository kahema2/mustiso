package com.example.mustiso.serviceImplementation;

import com.example.mustiso.entity.Payroll;
import com.example.mustiso.exception.PayrollException;
import com.example.mustiso.repository.PayrollRepository;
import com.example.mustiso.service.PayrollService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayrollServiceImplementation implements PayrollService {

    private PayrollRepository payrollRepository;

    public PayrollServiceImplementation(PayrollRepository payrollRepository) {
        this.payrollRepository = payrollRepository;
    }


    @Override
    public Payroll addPayroll(Payroll payroll) {
        return payrollRepository.save(payroll);
    }

    @Override
    public List<Payroll> getAllPayroll() {
        return payrollRepository.findAll();
    }

    @Override
    public Payroll getPayrollById(Long id) {
        Payroll payroll = payrollRepository.findById(id)
                .orElseThrow(()-> new PayrollException("Not found"));
        return payroll;
    }

    @Override
    public Payroll updatePayroll(Long id, Payroll payrollDetails) {
        Payroll payroll1 = payrollRepository.findById(id)
                .orElseThrow(()-> new PayrollException("Not found"));

        payroll1.setPayrollId(payrollDetails.getPayrollId());
        payroll1.setPayrollAmount(payrollDetails.getPayrollAmount());
        payroll1.setPayrollName(payrollDetails.getPayrollName());

        Payroll updatePayroll = payrollRepository.save(payroll1);
        return updatePayroll;
    }

    @Override
    public void deletePayroll(Long id) {
        Payroll payroll = payrollRepository.findById(id)
                .orElseThrow(()-> new PayrollException("Not found"));

        payrollRepository.delete(payroll);

    }
}
