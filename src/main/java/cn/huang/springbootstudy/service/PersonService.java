package cn.huang.springbootstudy.service;

import cn.huang.springbootstudy.dao.PersonDao;
import cn.huang.springbootstudy.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person p) {
        return personDao.insertPerson(p);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }
}
