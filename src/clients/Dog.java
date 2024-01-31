package clients;

import java.time.LocalDate;

public class Dog extends AnimGoingSwiming{

    public Dog(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes) {
        super(nameOfAnimal, owner, birthDate, illnes);
    }

    public Dog() {
    }
    @Override // перегрузка метода из класса Animal
    public void propertyOfAnimal(){
        this.going();   // методы из класса AnimGoingSwiming
        this.swiming();
    }
}
