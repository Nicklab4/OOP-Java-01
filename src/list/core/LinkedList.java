package list.core;

import list.core.util.ArrayIterator;

import java.util.Iterator;

public class LinkedList<T> implements GBList<T>{
    private int size =0;
    private Node<T> head;
    private Node<T> tail;

    private class Node<T> {
        Node<T> previous;
        private T value;
        Node<T> next;


        public Node() {
            this.previous = null;
            this.value = null;
            this.next = null;
        }

        public Node(T value) {
            this.previous = null;
            this.value = value;
            this.next = null;
        }


        public Node(Node<T> previous, T value) {
            this.previous = previous;
            this.value = value;
            this.next = null;

        }

        public Node(Node<T> previous, T value, Node<T> next) {
            this.previous = previous;
            this.next = next;
            this.value = value;
        }
    }

    @Override
    public void add(T elem) {
        Node<T> first = head;       // Создаём первый узел и помещаем в него головной элемент
                                    // Создаём второй узел взаимосвязанный с первым
        Node<T> newNode = new Node<T>(null, elem , head);
        head = newNode;             //
        if (first == null)
            tail = newNode;
        else first.previous= newNode;
        size++;
//
//        if (head == null)
//            head = new Node<T>(elem);
//        else{
//            tail = head;
//            head = new Node<T>(tail, elem);
//        }
//        size++;
    }

    @Override
    public void remove(int index) {             // Удаление элемента
        Node<T> node = tail;

        if (index+1 == size){                   // Решение для случая когда индекс элемента максимальный,
            node.previous.next = node.next;     // то-есть для крайнего правого элемента
        }

        else if (index == 0){                   // Решение для случая когда индекс равен нулю
            node = node.previous;               // то-есть для крайнего левого элемента
            node.next = null;
            tail = node;
        }

        else {                                  // Решение для случая когда индекс находится между
            while(index > 0 ){                  // левыми и правыми элементами, то есть больше ноля
                node = node.previous;           // и меньше максимального элемента
                index--;
            }

            node.next.previous = node.previous;
            node.previous.next = node.next;
        }

        size--;                                 // Уменьшение размера LinkedList после удаления элемента
    }

    @Override
    public T get(int index) {
        Node<T> node = tail;
        while(index-1 >= 0 ){
            node = node.previous;
            index--;
        }
        return node.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public T next() {
                return get(count++);
            }
        };
//        int index= 0 ;
//        Node<T> node = tail;
//        while(index != size){
//            index++;
//        }
//        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        int index= 0 ;
        Node<T> node = tail;
        while(index != size){
            builder.append(node.value).append(", ");
            index++;
            node = node.previous;
        }

        if (builder.length() == 1) return "[]";
        builder.deleteCharAt(builder.length()-1).deleteCharAt(builder.length()-1);
        builder.append("]");
        return builder.toString();
    }
}
