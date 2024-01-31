package clients;

import java.time.LocalDate;

public class Animal{
    protected final String nameOfAnimal;
    protected final Owner owner;
    protected final LocalDate birthDate;
    protected Illness illness;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public Animal() {
        this("кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    public Animal(String nameOfAnimal, Owner owner, LocalDate birthDate, Illness illnes) {
        this.nameOfAnimal = nameOfAnimal;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illnes;
    }

    private void wakeUp() {
        System.out.println("Животное проснулось");
    }

    private void wakeUp(String time) {
        System.out.println("Животное проснулось в " + time);
    }

    private void hunt(){
        System.out.println("животное охотится");
    }

    private void sleep(){
        System.out.println("животное спит");
    }

    private void eat(){
        System.out.println("животное ест");
    }

    public void lifeCicle(){
        this.wakeUp("12:00");
        this.hunt();
        this.eat();
        this.sleep();
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("nameOfAnimal = %s, bd = %s, owner = %s, illness = %s,", nameOfAnimal, birthDate, owner, illness);
    }

    public void propertyOfAnimal() {}
}
