package co.com.person.service.api.repositories;

import co.com.person.service.api.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Integer> {}
