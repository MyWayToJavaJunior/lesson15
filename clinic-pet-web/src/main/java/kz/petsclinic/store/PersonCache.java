package kz.petsclinic.store;

import kz.petsclinic.models.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Person cache
 */
public class PersonCache {

    private static final PersonCache INSTANCE = new PersonCache();

    private final ConcurrentHashMap<Integer, Person> persons = new ConcurrentHashMap<>();

    public static PersonCache getInstance() {
        return INSTANCE;
    }

    public Collection<Person> values() {
        return this.persons.values();
    }

    public Collection<Person> finded(final String nameOfPerson, final String nameOfPet) {
        Collection<Person> findedPersons = new ArrayList<>();
        for (Person person : this.persons.values()) {
            if (nameOfPerson.equals(person.getNameOfPerson()) || nameOfPet.equals(person.getNameOfPet()))
                findedPersons.add(person);
        }
        return findedPersons;
    }

    public void add(final Person person) {
        this.persons.put(person.getId(), person);
    }

    public void edit(final Person person) {
        this.persons.replace(person.getId(), person);
    }

    public void delete(final int id) {
        this.persons.remove(id);
    }

    public Person get(final int id) {
        return this.persons.get(id);
    }
}
