package veterinaryclinic.core.personnel.impl;

import veterinaryclinic.core.patients.Animal;
import veterinaryclinic.core.personnel.Personnel;

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