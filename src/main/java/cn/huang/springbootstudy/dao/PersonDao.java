package cn.huang.springbootstudy.dao;

import cn.huang.springbootstudy.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person p) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, p);
    }

    List<Person> selectAllPeople();

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);

    Optional<Person> selectPersonById(UUID id);
}
