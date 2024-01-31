package clients;

import java.time.LocalDate;

public class AnimGoingSwiming extends Animal{

    public AnimGoingSwiming() {super ();}

    public AnimGoingSwiming(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes)
    {super (nameOfAnimal, owner, birthDate, illnes);}
    public void going(){
        System.out.println("животное умеет бегать");
    }

    public void swiming(){
        System.out.println("животное умеет плавать");
    }
}
