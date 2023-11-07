package springmicro.organizationservice.mapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import springmicro.organizationservice.dto.OrganizationDto;
import springmicro.organizationservice.entity.OrganizationEntity;


public class OrganizationMapper {

    public static OrganizationDto mapToOrganizationDto(OrganizationEntity organizationEntity) {
        OrganizationDto dto = new OrganizationDto(
                organizationEntity.getId(),
                organizationEntity.getOrganizationName(),
                organizationEntity.getOrganizationDescription(),
                organizationEntity.getOrganizationCode(),
                organizationEntity.getCreatedDate()
        );
        return dto;
    }

    public static OrganizationEntity mapToOrganization(OrganizationDto organizationDto) {
        OrganizationEntity entity = new OrganizationEntity(
                organizationDto.getId(),
                organizationDto.getOrganizationName(),
                organizationDto.getOrganizationDescription(),
                organizationDto.getOrganizationCode(),
                organizationDto.getCreatedDate()
        );
        return entity;
    }
}
