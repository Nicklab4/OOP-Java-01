package list.core;

import java.util.Iterator;

public class LinkedList<T> implements GBList<T>{
    private int size;
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
        Node<T> first = head;
        Node<T> newNode = new Node<T>(null, elem , head);
        head = newNode;
        if (first == null)
            tail = newNode;
        else first.previous= newNode;
        size++;
//
//
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
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        Node<T> node = head;
        while(index >= 0 ){
            node = node.next;
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
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int index= 0 ;
        Node<T> node = head;
        while(index != size){
            builder.append(head.value).append(", ");
            index++;
            head = node.previous;
        }

        return builder.toString();
    }
}
