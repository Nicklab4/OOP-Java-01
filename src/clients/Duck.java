package clients;

import interfaces.IFlyable;
import interfaces.IGoable;
import interfaces.ISwimmable;

public class Duck  extends Animal implements IGoable, ISwimmable, IFlyable {

    public Duck(String nameOfAnimal){
        super(nameOfAnimal);
    }

    @Override // перегрузка метода из класса Animal
    public void propertyOfAnimal(){
        System.out.println("Бегает со скоростью " + this.run() + " м/с");
        System.out.println("Плавает со скоростью " + this.swim() + " м/с");
        System.out.println("Летает со скоростью " + this.fly() + " м/с");
    }

    public double run() { return 5.0; }

    public double fly() { return 20.0; }

    public double swim() { return 10.0; }
}
