package drugstore.components;

import drugstore.components.Component;
import drugstore.components.impl.Water;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component>, Comparable<Pharmacy2> {
    private List<Component> components = new ArrayList<Component>();
    private int index = 0;

    public void addComponents(Component ... components) {
        for (Component c : components)
            this.components.add(c);
    }

    public int getFullPower(){
        boolean waterFlag = false;
        int fullPowerThis = 0;
        for (Component c: this.components) {
            if (c instanceof Water){                // Лекарственная сила воды учитывается только один раз.
                if (waterFlag != true){             // Действующего вещества может быть двойная доза,
                    fullPowerThis += c.getPower();  // а от воды - сколько не лей, лучше не станет.
                    waterFlag = true;
                }
                continue;
            }

            fullPowerThis += c.getPower();
        }

        return fullPowerThis;
    }

    public int getFullWeight(){
        int weight = 0;
        for (Component c: this.components) weight += c.getWeight();
        return weight;
    }


//    @Override
//    public boolean hasNext() {
//        return (index < components.size());
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }


    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { // Анонимный класс
            @Override
            public boolean hasNext() {
                return (index < components.size());
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Pharmacy2 that) {
        return Integer.compare(this.getFullPower(), that.getFullPower());
    }

    @Override
    public String toString() {
        return "Pharm Preparat{" +
                "fullPower=" + this.getFullPower() +
                ", fullWeight=" + this.getFullWeight() +
                '}';
    }
}
