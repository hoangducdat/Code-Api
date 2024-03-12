package org.aibles.api.employee_manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeReponsitory employeeReponsitory;
    public List<Employee> getAllListEmployee() {
        return employeeReponsitory.findAll();
    }
}
