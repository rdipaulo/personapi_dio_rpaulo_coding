package one.digitalinnnovation.personapi.service;

import one.digitalinnnovation.personapi.dto.MessageResponseDTO;
import one.digitalinnnovation.personapi.entity.Person;
import one.digitalinnnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService( PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson( Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Creatd person with ID"+ savedPerson.getId())
                .build();
    }
}

