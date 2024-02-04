import clients.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        Animal catty = new clients.Cat("Барсик");
        Dog doggie = new clients.Dog("Шарик");
        Duck duffy = new clients.Duck("ДаффиДак");

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