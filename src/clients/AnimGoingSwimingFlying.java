package clients;

import java.time.LocalDate;

public class AnimGoingSwimingFlying extends Animal {


    public AnimGoingSwimingFlying() {super ();}

    public AnimGoingSwimingFlying(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes)
    {super (nameOfAnimal, owner, birthDate, illnes);}
    public void going() {
        System.out.println("животное умеет ходить");
    }

    public void swiming(){
        System.out.println("животное умеет плавать");
    }

    public void flying(){
        System.out.println("животное умеет летать");
    }
}
