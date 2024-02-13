package drugstore;

import drugstore.components.Pharmacy2;
import drugstore.components.impl.Azitromite;
import drugstore.components.Component;
import drugstore.components.impl.Penicillin;
import drugstore.components.impl.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrugMain  {
    public static void main(String[] args) {
        Component water = new Water("water", 10D, 1);
        Component azitronite = new Azitromite("azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(water, penicillin);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(penicillin, azitronite);


        List<Component> components = new ArrayList<Component>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);
        System.out.println(components);

        Collections.sort(components);
        System.out.println(components);

//        Iterator<Component> iterator = p1;
//
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

        for (Component c : p2) {
            System.out.println(" " + c);
        }

    }
}
