package com.example.springbootelasticsearch.service.impl;

import com.example.springbootelasticsearch.model.Person;
import com.example.springbootelasticsearch.repositories.PersonRepository;
import com.example.springbootelasticsearch.service.PersonService;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }
}
