package veterinaryclinic.core;// Выдача списка всех пациентов
// Выдача списка всего персонала
// Выдача списка бегающих пациентов, плавающих, летающих
// список

import veterinaryclinic.core.patients.Animal;
import veterinaryclinic.core.patients.impl.IFlyable;
import veterinaryclinic.core.patients.impl.IGoable;
import veterinaryclinic.core.patients.impl.ISwimmable;
import veterinaryclinic.core.personnel.impl.Doctor;
import veterinaryclinic.core.personnel.impl.Nurse;
import veterinaryclinic.core.personnel.Personnel;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    List<Personnel> personnel;
    List<Animal> patients;


    Nurse nurse = new Nurse("Амалия Ивановна");



    public VeterinaryClinic(){
        this.personnel = new ArrayList<Personnel>();
        this.patients  = new ArrayList<Animal>();

        personnel.add(nurse);
    }

    public void setAnimals(List<Animal> animals) {  patients = animals; }
    public void addAnimal(Animal animal) { patients.add(animal); }


    public void getAnimals() {
        System.out.println(patients.toString());
    }

    public void medicalProcedures() {
        for (Personnel pers : personnel){
            pers.medicalProcedures(patients);
        }
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void addEmpoloyee(Personnel personnel) {
        this.personnel.add(personnel);

    }

    public void addPatients(Animal animal) {
        this.patients.add(animal);
    }

    public List<Animal> getGoables() {
        List<Animal> result = new ArrayList<Animal>();
        for (Animal animal : patients)
            if (animal instanceof IGoable) result.add(animal);
        return result;
    }

    public List<Animal>  getFlyable() {
        List<Animal> result = new ArrayList<Animal>();
        for (Animal animal : patients)
            if (animal instanceof IFlyable) result.add(animal);
        return result;
    }

    public List<Animal>  getSwimmable() {
        List<Animal> result = new ArrayList<Animal>();
        for (Animal animal : patients)
            if (animal instanceof ISwimmable) result.add(animal);
        return result;
    }
}