package com.example.demo.data.repositories;

import com.example.demo.data.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByEmail(String email);
    Optional<Person> findByPhoneNumber(String phoneNumber);
//    List<Person> findByLastName(String lastName);
    Optional<List<Person>> findByFirstName(String firstName);

    List<Person> findByLastNameIgnoreCase(String lastName);
}
