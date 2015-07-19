package kz.petsclinic.models;

/**
 * bird extends Pet
 */
public class Bird extends AbstractPet {
    final static String BIRD_ABILITY = "kill dogs";

    public Bird(String nameOfPet) {
        super(nameOfPet, BIRD_ABILITY);
    }
}
