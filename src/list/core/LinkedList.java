package list.core;

import list.core.util.ArrayIterator;

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
        Node<T> node = tail;
        while(index-1 >= 0 ){
            node = node.previous;
            index--;
        }

        node.next.previous = node.previous.next;
        size--;

        //Node<T> tempPrev = node.next;
        //Node<T> tempNext = node.previous;

        //tempPrev.next = tempNext;
        //tempNext.previous = tempPrev;
        //node.next = null;
        //node.previous = null;

        //System.out.println(tempPrev.next);
        //System.out.println(node.value);
        //System.out.println(tempNext.previous);
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
//        int index= 0 ;
//        Node<T> node = tail;
//        while(index != size){
//            index++;
//        }
        return null;
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
