package com.spring.springbootbackend.service.impl;

import com.spring.springbootbackend.model.Employee;
import com.spring.springbootbackend.repository.EmployeeRepository;
import com.spring.springbootbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
