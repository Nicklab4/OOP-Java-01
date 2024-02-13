package list;

import list.core.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(10);
        lList.add(20);
        lList.add(30);
        lList.add(40);

        System.out.println(lList.size());
        System.out.println(lList);
        System.out.println(lList.get(1));
        lList.remove(1);
        System.out.println(lList);
    }
}
