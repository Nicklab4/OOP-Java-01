package veterinaryclinic.core.patients.impl;

import veterinaryclinic.core.patients.Animal;

public class Duck  extends Animal implements IGoable, ISwimmable, IFlyable {

    public Duck(String nameOfAnimal){
        super(nameOfAnimal);
    }

    @Override // перегрузка метода из класса Animal
    public void propertyOfAnimal(){
        System.out.println("Утка бегает со скоростью " + this.run() + " м/с");
        System.out.println("Утка плавает со скоростью " + this.swim() + " м/с");
        System.out.println("Утка летает со скоростью " + this.fly() + " м/с");
    }

    public double run() { return 5.0; }

    public double fly() { return 20.0; }

    public double swim() { return 10.0; }
}
