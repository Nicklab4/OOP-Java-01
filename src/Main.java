import veterinaryclinic.clients.*;
import veterinaryclinic.VeterinaryClinic;
import veterinaryclinic.clients.animal.Cat;
import veterinaryclinic.clients.animal.Dog;
import veterinaryclinic.clients.animal.Duck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        Animal catty = new Cat("Барсик");
        Dog doggie = new Dog("Шарик");
        Duck duffy = new Duck("ДаффиДак");

        catty.propertyOfAnimal();
        duffy.propertyOfAnimal();

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(doggie);
        animals.add(catty);

        clinic.setAnimals(animals); // Помещаем в класс клиники список животных
        clinic.addAnimal(duffy);    // Добавляем животных по одному

        clinic.getAnimals();        // Выводим список животных в клинике
        clinic.getPersonnel();      // Выводим список медперсонала клиники

        clinic.medicalProcedures(); // Выполняем медпроцедуры клиники
    }
}