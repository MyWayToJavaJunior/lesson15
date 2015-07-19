package kz.petsclinic.models;

/**
 * dog extends Pet
 */
public class Dog extends AbstractPet {
    final static String DOG_ABILITY = "kill cats";

    public Dog(String nameOfPet) {
        super(nameOfPet, DOG_ABILITY);
    }
}

