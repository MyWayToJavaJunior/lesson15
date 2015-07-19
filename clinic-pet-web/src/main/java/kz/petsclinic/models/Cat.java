package kz.petsclinic.models;

/**
 * Cat extends Pet
 */
public class Cat extends AbstractPet {
    final static String CAT_ABILITY = "kill birds";

    public Cat(String nameOfPet) {
        super(nameOfPet, CAT_ABILITY);
    }
}
