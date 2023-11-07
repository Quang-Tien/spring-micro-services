package springmicro.organizationservice.service;

import org.springframework.stereotype.Service;
import springmicro.organizationservice.dto.OrganizationDto;


public interface OrganizationService {

    public OrganizationDto save(OrganizationDto organizationDto);

    public OrganizationDto findById(Long id);

    OrganizationDto findByOrganizationCode(String code);
}
