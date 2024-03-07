package com.group.employee.service;

import com.group.employee.domain.Employee;
import com.group.employee.repository.EmployeeRepository;
import com.group.employee.request.EmployeeRequest;
import com.group.employee.response.EmployeeResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Transactional
    public void employeeSave(EmployeeRequest request){
        employeeRepository.save(Employee.builder()
                        .name(request.getName())
                        .teamName(request.getTeamName())
                        .role(request.getRole())
                        .JoiningTheCompany(request.getJoiningTheCompany())
                        .birthday(request.getBirthday())
                .build());
    }

    @Transactional(readOnly = true)
    public List<EmployeeResponse> findEmployee() {
        return employeeRepository.findAll().stream()
                .map(EmployeeResponse::new)
                .collect(Collectors.toList());

    }
}
