package list;

import list.core.GBList;
import list.core.impl.GBArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();

        list.add(3);
        list.add(7);
        list.add(159);

        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());


    }
}
