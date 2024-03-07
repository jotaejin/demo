package com.group.employee.controller;

import com.group.employee.request.EmployeeRequest;
import com.group.employee.response.EmployeeResponse;
import com.group.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/employee/save")
    public void EmployeeSave(@RequestBody EmployeeRequest request) {
        employeeService.employeeSave(request);
    }

    @GetMapping("/employees")
    public List<EmployeeResponse> findEmployee() {
        return employeeService.findEmployee();
    }
}
