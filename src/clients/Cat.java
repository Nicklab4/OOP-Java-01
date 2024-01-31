package clients;

import java.time.LocalDate;

public class Cat extends Animal{

    Double discount; //todo напомнить в чём разница Double b Вщг


    public Cat(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes) {
        super(nameOfAnimal, owner, birthDate, illnes);
        this.discount = discount;
    }

    public Cat() {super();
        this.discount = 10.0;}

    @Override
    public String toString() {
        return super.toString()  + "discount=" + discount +'}';
    }

    public void meow() {
        System.out.println(this.nameOfAnimal + " meow");
    }
}
