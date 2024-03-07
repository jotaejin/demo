package com.group.employee.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class EmployeeRequest {
    private String name;

    private String teamName;

    private String role;

    private LocalDate joiningTheCompany;

    private LocalDate birthday;
}
