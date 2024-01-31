package clients;

public class Duck extends AnimGoingSwimingFlying {
    @Override // перегрузка метода из класса Animal
    public void propertyOfAnimal(){
        this.going();   // методы из класса AnimGoingSwimingFlying
        this.swiming();
        this.flying();
    }
}
