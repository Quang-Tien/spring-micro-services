package springmicro.employeeservice.service;

import org.springframework.stereotype.Service;
import springmicro.employeeservice.dto.APIResponseDto;
import springmicro.employeeservice.dto.EmployeeDto;


public interface EmployeeService {

    EmployeeDto save(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long id);
}
