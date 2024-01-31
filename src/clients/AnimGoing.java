package clients;

import java.time.LocalDate;

public class AnimGoing extends Animal{
    public AnimGoing() {super ();}

    public AnimGoing(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes)
    {super (nameOfAnimal, owner, birthDate, illnes);}
    public void going(){
        System.out.println("животное умеет бегать");
    }
}
