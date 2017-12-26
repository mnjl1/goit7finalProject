package goit.springboot.project.repository;

import goit.springboot.project.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "workers", path = "workers")
public interface EmployeeRepositoryRest extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findByLastName(@Param("name") String name);
}
