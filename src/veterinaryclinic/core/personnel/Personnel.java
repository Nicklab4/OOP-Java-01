package veterinaryclinic.core.personnel;
import veterinaryclinic.core.patients.Animal;

import java.util.List;
import java.util.Map;

public abstract class Personnel {
    protected String nameOfPersonnel;
    private String profession;

    private final Map<Integer, String> diagnoses = Map.of(0, "перелом",1, "лишай",
                                                          2, "чумка", 3, "бешенство");

    public String getNameOfPersonnel() {
        return nameOfPersonnel;
    }

    public void setNameOfPersonnel(String nameOfPersonnel) {
        this.nameOfPersonnel = nameOfPersonnel;
    }

    public Personnel(String nameOfPersonnel) {
        this.nameOfPersonnel = nameOfPersonnel;
    }

    @Override
    abstract public String toString();

    public abstract void medicalProcedures(List<Animal> animal) ;

    public String doDiagnose(Animal animal) {
        int key = (int)(Math.random() * 4);
        return animal.getNameOfAnimal() + " подхватил " + diagnoses.get(key);
    }
}
