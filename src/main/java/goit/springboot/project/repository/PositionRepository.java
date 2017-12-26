package goit.springboot.project.repository;

import goit.springboot.project.model.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepository extends CrudRepository<Position, Long> {
}
