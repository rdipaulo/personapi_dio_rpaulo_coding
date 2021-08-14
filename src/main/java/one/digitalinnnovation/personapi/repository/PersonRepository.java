package one.digitalinnnovation.personapi.repository;

import one.digitalinnnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
