import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Barsic", new clients.Owner("Сергей Валерьевич"),
                LocalDate.of(2023,10,21), new clients.Illness("лишай") );

//        System.out.println(cat.getNameOfAnimal());
//        System.out.println(cat.getOwner());
//
//        cat.setIllness(null);
//
//        Animal testAnimal = new Animal();
//        System.out.println(testAnimal.getNameOfAnimal());
//
//        cat.lifeCicle();
//        System.out.println(cat.toString());

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

            System.out.println("Свойства животного при помощи методов присущих подклассу");
            //Условие определяющее принадлежность какому либо подклассу
            if(animal instanceof AnimGoing){
                //выполнение действий этого подкласса
                ((AnimGoing)animal).going();
            }

            if(animal instanceof AnimGoingSwiming){
                ((AnimGoingSwiming)animal).going();
                ((AnimGoingSwiming)animal).swiming();
            }

            if(animal instanceof AnimGoingSwimingFlying){
                ((AnimGoingSwimingFlying)animal).going();
                ((AnimGoingSwimingFlying)animal).swiming();
                ((AnimGoingSwimingFlying)animal).flying();
            }

            // Вызов свойств класса при помощи метода переопределённого в каждом подклассе
            System.out.println("Свойства животного при помощи метода propertyOfAnimal()");
            animal.propertyOfAnimal();
        }
    }
}

