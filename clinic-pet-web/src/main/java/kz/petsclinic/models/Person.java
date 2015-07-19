package kz.petsclinic.models;

/**
 * person
 */
public class Person {
    private String nameOfPerson;
    private AbstractPet petOfPerson;
    private int id;

    public Person(final int id, final String nameOfPerson, final AbstractPet petOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.petOfPerson = petOfPerson;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public AbstractPet getPetOfPerson() {
        return this.petOfPerson;
    }

    public String getNameOfPerson() {
        return this.nameOfPerson;
    }

    public String getNameOfPet() {
        return this.petOfPerson.getNameOfPet();
    }

    public String getTypeOfPet() {
        return this.petOfPerson.getClass().getSimpleName();
    }

    public String getAbilityOfPet() {
        return this.petOfPerson.getAbilityOfPet();
    }

}
