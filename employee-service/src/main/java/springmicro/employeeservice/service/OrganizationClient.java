package springmicro.employeeservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springmicro.employeeservice.dto.DepartmentDto;
import springmicro.employeeservice.dto.OrganizationDto;

@FeignClient(name = "ORGANIZATION-SERVICE")
public interface OrganizationClient {

    @GetMapping("api/organizations/{organizationCode}")
    OrganizationDto getOrganizationByCode(@PathVariable("organizationCode") String code);
}