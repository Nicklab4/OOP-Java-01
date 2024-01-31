package clients;

import java.time.LocalDate;

public class Dog extends Animal{

    public Dog(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes) {
        super(nameOfAnimal, owner, birthDate, illnes);
    }

    public Dog() {
    }
}
