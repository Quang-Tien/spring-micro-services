package springmicro.organizationservice.service.impl;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmicro.organizationservice.dto.OrganizationDto;
import springmicro.organizationservice.entity.OrganizationEntity;
import springmicro.organizationservice.mapper.OrganizationMapper;
import springmicro.organizationservice.repository.OrganizationRepository;
import springmicro.organizationservice.service.OrganizationService;


@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto save(OrganizationDto organizationDto) {
        OrganizationEntity organizationEntity = OrganizationMapper.mapToOrganization(organizationDto);
        OrganizationEntity savedOrganization = organizationRepository.save(organizationEntity);
        OrganizationDto savedOrganizationDto = OrganizationMapper.mapToOrganizationDto(savedOrganization);
        return savedOrganizationDto;
    }

    @Override
    public OrganizationDto findById(Long id) {
        OrganizationEntity foundOrganization = organizationRepository.findById(id).orElse(null);
        OrganizationDto dto = OrganizationMapper.mapToOrganizationDto(foundOrganization);
        return dto;
    }

    @Override
    public OrganizationDto findByOrganizationCode(String code) {
        OrganizationEntity foundOrganization = organizationRepository.findByOrganizationCode(code);
        OrganizationDto dto = OrganizationMapper.mapToOrganizationDto(foundOrganization);
        return dto;
    }
}
