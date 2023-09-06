package springmicro.employeeservice.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springmicro.employeeservice.dto.DepartmentDto;

@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-SERVICE")
public interface APIClient {

    @GetMapping("api/departments/{code}")
    DepartmentDto getDepartmentByCode(@PathVariable String code);
}
