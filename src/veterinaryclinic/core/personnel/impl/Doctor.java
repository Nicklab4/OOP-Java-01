package veterinaryclinic.core.personnel.impl;

import veterinaryclinic.core.patients.Animal;
import veterinaryclinic.core.personnel.Personnel;

import java.util.List;

public class Doctor extends Personnel {
    private String profession = "Доктор";

    private Nurse nurse;

    public Doctor(String nameOfDoctor) {
        super(nameOfDoctor);
    }
    public Doctor(String nameOfPersonnel, Nurse nurse) {
        super(nameOfPersonnel);
        this.nurse = nurse;
    }

    public void fireNurse() {
        this.nurse= null;
    }

    public void setNurse(Nurse nurse) {
        this.nurse= nurse;
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