import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Barsic", new clients.Owner("Сергей Валерьевич"),
                LocalDate.of(2023,10,21), new clients.Illness("лишай") );

        System.out.println(cat.getNameOfAnimal());
        System.out.println(cat.getOwner());

        cat.setIllness(null);

        Animal testAnimal = new Animal();
        System.out.println(testAnimal.getNameOfAnimal());

        cat.lifeCicle();
        System.out.println(cat.toString());

        Animal catty = new clients.Cat();
        clients.Dog goodBoy = new clients.Dog();

        System.out.println(catty.getType());

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        animals.add(goodBoy);
        animals.add(catty);

        for (Animal animal : animals )
        {
            System.out.println(animal);}
    }
}

