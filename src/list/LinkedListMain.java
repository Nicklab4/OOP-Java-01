package list;

import list.core.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(10);
        lList.add(20);
        lList.add(30);
        lList.add(40);

        System.out.println("Количество эллементов - " + lList.size());
        System.out.println("Список всех элементов - " + lList);
        System.out.println("Значение элемента по индексу 1 - " + lList.get(1));
        lList.remove(1);
        System.out.println("Список всех элементов после удаления элемента с индексом 1: \n" + lList);


        System.out.println("Проход циклом For, реализация итератора:");
        for (Integer i : lList) {
            System.out.println(i);
        }
    }
}
