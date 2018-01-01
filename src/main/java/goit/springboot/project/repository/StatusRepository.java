package goit.springboot.project.repository;

import goit.springboot.project.model.Status;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<Status, Integer> {
}
