package goit.springboot.project.repository;

import goit.springboot.project.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Integer> {
}
