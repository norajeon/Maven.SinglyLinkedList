package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node start;

    static class Node <T> {

        T value;
        Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public static <T> SinglyLinkedList add(SinglyLinkedList list, T value) {
        Node node = new Node(value);

        if(list.start == null) {
            list.start = node;
        } else {
            Node end = list.start;
            while (end.next != null) {
                end = end.next;
            }
            end.next = node;
//            LinkedList abc = new LinkedList();
        }
        return list;
    }


    public static <T> SinglyLinkedList remove(SinglyLinkedList list, int index) {

    }

}
