package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    //Create get all Employees Method in interface
    List<EmployeeDto> getAllEmployees();

    //Create update Employee Method in interface
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);
}
