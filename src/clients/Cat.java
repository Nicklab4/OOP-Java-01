package clients;

import interfaces.IGoable;

import java.time.LocalDate;

public class Cat extends Animal implements IGoable {

    Double discount; //напомнить в чём разница Double b Вщг


    public Cat(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes) {
        super(nameOfAnimal, owner, birthDate, illnes);
        this.discount = discount;
    }

    public Cat(String nameOfAnimal){
        super(nameOfAnimal);
    }

    public Cat() {super();
        this.discount = 10.0;}

    @Override
    public String toString() {
        return super.toString()  + "discount=" + discount +'}';
    }

    public void meow() {
        System.out.println(this.getNameOfAnimal() + " meow");
    }

    @Override // перегрузка метода из класса Animal
    public void propertyOfAnimal(){
        System.out.println("Бегает со скоростью " + this.run() + " м/с");
    }

    public double run() {return 10.0;}
}