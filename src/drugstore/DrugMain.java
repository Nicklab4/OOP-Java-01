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

        Pharmacy2 p4 = new Pharmacy2();
        p4.addComponents(penicillin, water, water, water, water);

        List<Pharmacy2> medicines = new ArrayList<>();
        medicines.add(p3);
        medicines.add(p1);
        medicines.add(p2);
        medicines.add(p4);

        System.out.println("Список препаратов: \n" + medicines);
        Collections.sort(medicines);
        System.out.println("Список препаратов отсортированный по силе: \n" + medicines);
        Collections.sort(medicines, (a, b ) -> Integer.compare(a.getFullWeight(), b.getFullWeight()));
        System.out.println("Список препаратов отсоритрованный по массе: \n"+ medicines);



//        List<Component> components = new ArrayList<Component>();
//        components.add(azitronite);
//        components.add(water);
//        components.add(penicillin);
//        System.out.println(components);
//
//        Collections.sort(components);
//        System.out.println(components);

//        Iterator<Component> iterator = p1;
//
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c : p2) {
//            System.out.println(" " + c);
//        }

    }
}
