package veterinaryclinic.core.patients.impl;

import veterinaryclinic.core.patients.Illness;
import veterinaryclinic.core.patients.Animal;
import veterinaryclinic.core.clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements IGoable, ISwimmable {

    public Dog(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes) {
        super(nameOfAnimal, owner, birthDate, illnes);
    }

    public Dog(String nameOfAnimal){
        super(nameOfAnimal);
    }
    @Override // перегрузка метода из класса Animal
    public void propertyOfAnimal(){
        System.out.println("Собака бегает со скоростью " + this.run() + " м/с");
        System.out.println("Собака плавает со скоростью " + this.swim() + " м/с");
    }


    public double run() { return 10.0; }

    public double swim() { return 5.0;}
}
