import clients.*;
import clients.interfaces.IFlyable;
import clients.interfaces.IGoable;
import clients.interfaces.ISwimmable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Barsic", new clients.Owner("Сергей Валерьевич"),
                LocalDate.of(2023,10,21), new clients.Illness("лишай") );

        Animal catty = new clients.Cat();
        clients.Dog doggie = new clients.Dog();
        Duck duffy = new clients.Duck();

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        animals.add(doggie);
        animals.add(catty);
        animals.add(duffy);

        for (Animal animal : animals )
        {
            System.out.println(animal.getType());

            System.out.println("Свойства животного при помощи методов присущих интерфейсам");
            //Условие определяющее принадлежность какому либо подклассу
            if(animal instanceof IGoable){
                //выполнение действий этого подкласса
                System.out.println("Животное по кличке " + animal.getNameOfAnimal() +
                        " умеет бегать со скоростью " + ((IGoable) animal).run() + " м/с");
            }

            if(animal instanceof IFlyable){
                System.out.println("Животное по кличке " + animal.getNameOfAnimal() +
                        " умеет летать со скоростью " + ((IFlyable) animal).fly() + " м/с");
            }

            if(animal instanceof ISwimmable){
                System.out.println("Животное по кличке " + animal.getNameOfAnimal() +
                        " умеет плавать со скоростью " + ((ISwimmable) animal).swim() + " м/с");
            }

            // Вызов свойств класса при помощи метода переопределённого в каждом подклассе
            System.out.println("Свойства животного при помощи метода propertyOfAnimal()");
            animal.propertyOfAnimal();
        }
    }
}

