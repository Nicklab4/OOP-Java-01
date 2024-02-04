package personnel;
import clients.Animal;
import clients.Illness;

import java.util.ArrayList;
import java.util.List;

public abstract class Personnel {
    protected String nameOfPersonnel;
    private String profession;

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
}
