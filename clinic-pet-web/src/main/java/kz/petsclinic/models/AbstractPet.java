package kz.petsclinic.models;

/**
 * Abstract Pet
 */
public class AbstractPet {
    String nameOfPet;
    String abilityOfPet;

    public AbstractPet(final String nameOfPet, final String abilityOfPet) {
        this.nameOfPet = nameOfPet;
        this.abilityOfPet = abilityOfPet;
    }

    public String getNameOfPet() {
        return this.nameOfPet;
    }

    public String getAbilityOfPet() {
        return abilityOfPet;
    }
}
