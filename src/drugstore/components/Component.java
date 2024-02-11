package drugstore.components;

public abstract class Component implements Comparable<Component> {
    private String title;
    private double weight;
    private int power;

    public Component(String title, double weight, int power) { // alt+insert добавление конструктора
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, Power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(power, o.power);  // три варианта организации сравнения

//        return this.power - o.power;


//        if (this.power > o.power) return 1;
//        else if (this.power == o.power) return 0;
//        else return -1;
    }
}
