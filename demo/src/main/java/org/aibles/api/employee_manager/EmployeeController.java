package org.aibles.api.employee_manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    public static final Logger LOGGER = Logger.getLogger(EmployeeController.class.getName());
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/list")
    public ResponseEntity<List<Employee>> getAllListEmployee() {
        LOGGER.info("GET LIST EMPLOYEE");
        List<Employee> employeeList = employeeService.getAllListEmployee();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }
}
