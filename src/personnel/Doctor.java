package personnel;

import clients.Animal;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Personnel {
    private String profession = "Доктор";


    public Doctor(String nameOfDoctor) {
        super(nameOfDoctor);
    }
    @Override
    public void medicalProcedures(List<Animal> listAnimal) {
        for (Animal animal : listAnimal)
        System.out.println("Доктор проверяет сотояние животного " + animal.getNameOfAnimal());
    }

    @Override
    public String toString() {
        return profession +  " - " + nameOfPersonnel;
    }
}