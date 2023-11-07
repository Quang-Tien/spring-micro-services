package springmicro.organizationservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springmicro.organizationservice.dto.OrganizationDto;
import springmicro.organizationservice.service.OrganizationService;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDto> save(@RequestBody OrganizationDto organizationDto) {
        OrganizationDto organizationDto1 = organizationService.save(organizationDto);

        return new ResponseEntity<>(organizationDto1, HttpStatus.CREATED);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<OrganizationDto> getOrganizationById(@PathVariable Long id) {
//        OrganizationDto organizationDto = organizationService.findById(id);
//        return new ResponseEntity<>(organizationDto, HttpStatus.CREATED);
//    }

    @GetMapping("/{organizationCode}")
    public ResponseEntity<OrganizationDto> getOrganizationByCode(@PathVariable("organizationCode") String code) {
        OrganizationDto organizationDto = organizationService.findByOrganizationCode(code);
        return new ResponseEntity<>(organizationDto, HttpStatus.CREATED);
    }

}
