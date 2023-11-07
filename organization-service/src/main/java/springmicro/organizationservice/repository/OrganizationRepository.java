package springmicro.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springmicro.organizationservice.entity.OrganizationEntity;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<OrganizationEntity, Long> {

    public List<OrganizationEntity> findAll();

    OrganizationEntity findByOrganizationCode(String code);
}
