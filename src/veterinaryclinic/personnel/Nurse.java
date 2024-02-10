package veterinaryclinic.personnel;

import veterinaryclinic.clients.Animal;

import java.util.List;

public  class Nurse extends Personnel{
    private String profession = "Медсестра";

    public Nurse(String nameOfNurse) {
        super(nameOfNurse);
    }
    @Override
    public void medicalProcedures(List<Animal> listAnimal) {
        for (Animal animal : listAnimal)
        System.out.println("Медсестра делает процедуры животному " + animal.getNameOfAnimal());
    }

    @Override
    public String toString() {
        return profession +  " - " + nameOfPersonnel;
    }
}
