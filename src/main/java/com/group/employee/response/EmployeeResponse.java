package com.group.employee.response;

import com.group.employee.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class EmployeeResponse {
    private String name;

    private String employeeName;

    private String isEmployee;

    private LocalDate joiningTheCompany;

    private LocalDate birthday;

    public EmployeeResponse(Employee employee) {
        this.name = employee.getName();
        this.employeeName = employee.getTeamName();
        this.isEmployee = employee.getRole();
        this.joiningTheCompany = employee.getJoiningTheCompany();
        this.birthday = employee.getBirthday();
    }
}
