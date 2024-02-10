package veterinaryclinic;

import veterinaryclinic.core.patients.Animal;
import veterinaryclinic.core.VeterinaryClinic;
import veterinaryclinic.core.patients.impl.Cat;
import veterinaryclinic.core.patients.impl.Dog;
import veterinaryclinic.core.patients.impl.Duck;
import veterinaryclinic.core.personnel.impl.Doctor;
import veterinaryclinic.core.personnel.Personnel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();
        Personnel doctor = new Doctor("Антон Павлович Чехов");

        Animal catty = new Cat("Барсик");
        Dog doggie = new Dog("Шарик");
        Duck duffy = new Duck("ДаффиДак");

        clinic.addEmpoloyee(doctor);
        clinic.addPatients(catty); // Добавляем животных по одному
        clinic.addPatients(doggie);
        clinic.addPatients(duffy);


        System.out.println(clinic.getPatients());  // Выводим список животных в клинике
        System.out.println(clinic.getPersonnel()); // Выводим список медперсонала клиники
        System.out.println(clinic.getGoables()); // Выводим всех бегающих
        System.out.println(clinic.getFlyable());
        System.out.println(clinic.getSwimmable());

        System.out.println(doctor.doDiagnose(catty));



        //clinic.medicalProcedures(); // Выполняем медпроцедуры клиники
    }
}