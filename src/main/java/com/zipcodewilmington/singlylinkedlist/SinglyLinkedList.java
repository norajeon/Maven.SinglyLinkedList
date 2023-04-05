package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    Node<T> head;



    public void add(T value) {
        if(head == null) {
            head = new Node<T>(value);
        } else {
            Node<T> current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node<T>(value));
        }

    }

    public Node<T> get(int index) {
        int hi = 0;
        Node<T> current = head;
        while(current != null) {
            if (hi == index) {
                return current;
            }
            current = current.getNext();
            hi++;
        }
        return null;
    }

    public boolean contains(T value) {
        Node<T> current = head;
        while(current != null) {
           if(current.getData().equals(value)) {
               return true;
           }
           current = current.getNext();
        }
        return false;

    }

    public void remove(String hi) {
    }

    public int find(T value) {
        int counter = 0;
        Node<T> current = head;
        while(current != null) {
            if (current.getData().equals(value)) {
                return counter;
            }
            current = current.getNext();
            counter++;
        }
        return -1;
    }

    public int size() {
        int size = 0;
        Node<T> current = head;
        while(current != null) {
            current = current.getNext();
            size++;
            }
        return size;
    }

    public SinglyLinkedList<String> copy() {
        return null;
    }

    public void sort() {
    }

//    static class Node <T> {
//
//        T value;
//        Node<T> next;
//
//
//
//        public Node(T value) {
//            this.value = value;
//            this.next = null;
//        }
//    }
//
//    public static <T> SinglyLinkedList<T> add(SinglyLinkedList<T> list, T value) {
//        Node<T> node = new Node<T>(value);
//
//        if(list.start == null) {
//            list.start = node;
//        } else {
//            Node<T> end = list.start;
//            while (end.next != null) {
//                end = end.next;
//            }
//            end.next = node;
////            LinkedList abc = new LinkedList();
//        }
//        return list;
//    }
//
//
//    public static <T> SinglyLinkedList<T> remove(SinglyLinkedList<T> list, int index) {
//        Node<T> currentNode = list.start;
//        Node<T> previous = null;
//
//        if (index == 0 && currentNode != null) {
//            list.start = currentNode.next;
//            return list;
//        }
//        int count = 0;
//        while (currentNode != null) {
//            if (count == index) {
//                previous.next = currentNode.next;
//                break;
//            } else {
//                previous = currentNode;
//                currentNode = currentNode.next;
//                count++;
//            }
//        }
//
//        return list;
//    }
//
//    public static <T> int size(SinglyLinkedList<T> list) {
//        Node<T> currentNode = list.start;
//        int count = 0;
//        while (currentNode != null) {
//            currentNode = currentNode.next;
//            count++;
//        }
//        return count;
//    }

}
