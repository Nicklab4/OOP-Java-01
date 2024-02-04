// Выдача списка всех пациентов
// Выдача списка всего персонала
// Выдача списка бегающих пациентов, плавающих, летающих
// список

import clients.Animal;
import personnel.Doctor;
import personnel.Nurse;
import personnel.Personnel;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    Doctor doctor = new Doctor("Антон Павлович Чехов");
    Nurse nurse = new Nurse("Амалия Ивановна");

    List<Personnel> personnel = new ArrayList<Personnel>();
    List<Animal> listAnimals = new ArrayList<Animal>();

    public VeterinaryClinic(){
        personnel.add(doctor);
        personnel.add(nurse);
    }

    public void setAnimals(List<Animal> animals) {  listAnimals = animals; }
    public void addAnimal(Animal animal) { listAnimals.add(animal); }

    public void getPersonnel() {
        System.out.println(personnel.toString());
    }

    public void getAnimals() {
        System.out.println(listAnimals.toString());
    }

    public void medicalProcedures() {
        for (Personnel pers : personnel){
            pers.medicalProcedures(listAnimals);
        }
    }

}