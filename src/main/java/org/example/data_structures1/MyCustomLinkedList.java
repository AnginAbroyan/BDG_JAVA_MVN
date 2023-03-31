package org.example.data_structures1;

import javax.swing.plaf.IconUIResource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyCustomLinkedList<E> {

    /**
     * Inner class for node object fields.
     * inner, because we don't want others to have access to it beside our MyCustomLinkedList<E> class's objects and methods,
     * which in this case have access to data, next and prev fields.
     */
   private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E obj) {
            data = obj;
            next = null;
            prev = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    public MyCustomLinkedList() { // public constructor for MyCustomLinkedList fields.
        head = null;
        tail = null;
        currentSize = 0;
    }

    /**
     * Gets the size of the LinkedList.
     */
    public int size() {
        return currentSize;
    }

    /**
     * Checks whether the LinkedList is empty or not, checks via checking the head being null o not.
     *
     * @return true if the list is empty and false if not
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Gets the element from list with given index.
     * @param index of the element that will be got
     * @return found element
     */

    public E get(int index) {

        Node<E> tmp = head;
        int count = 0;
        while (tmp != null){
            if (count == index){
                return tmp.data;
            }
            count++;
            tmp = tmp.next;
        }
        throw  new ArrayIndexOutOfBoundsException();
    }

    /**
     * Adds new elements into a list.
     * @param obj element whose presence in this collection is to be ensured
     * @return true, if successfully added new element
     */

    public boolean add(E obj) {
        Node<E> node = new Node<E>(obj);
        if (isEmpty()) {
            head = tail = node;
            head.prev = null;
            tail.next = null;
            return true;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        tail.next = null;
        return true;
    }

    /**
     * Adds elements in the first position of the list.
     * @param obj is the element to be added in the list.
     */
    public void addFirst(E obj) {
        Node<E> node = new Node<E>(obj);
        if (isEmpty()) {
            head = tail = node;
            currentSize++;
            return;
        }
        node.next = head;
        head = node;
        currentSize++;
        return;
    }


    /**
     * Add an element in the last position of the list.
     * @param obj, the element to be added to the list
     */
    public void addLast(E obj) {
        Node<E> node = new Node<E>(obj);
        if (isEmpty()) {
            head = tail = node;
            currentSize++;
            return;
        }
        node.next = tail;
        tail = node;
        currentSize++;
        return;
    }

    /**
     * Removes an elements from a list from the start.
     * @return the removed element
     */
    public E removeFirst() {
        Node<E> current = head, prev = null;
        if (isEmpty()) {
            return null;
        }
        E tmp = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        currentSize--;
        return tmp;
    }


    /**
     * removes an elements from the end of the list
     * @return the removed element
     */
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E tmp = tail.data;
        if (head == tail) {
            return removeFirst();
        }
        tail.prev.next = null;
        tail = tail.prev;
        currentSize--;
        return tmp;
    }

    /**
     * Changes specific element with given element
     * @param index of the element which will be changed with
     * @param element  new element to be set
     */
    public void set(int index,E element){
        Node<E> tmp = head;
        int count = 0;

        while (tmp != null){
            if (index == count){
                tmp.data = element;
                return;
            }
            tmp = tmp.next;
            count++;
        }
    }

    /**
     * Clears the list,makes brand new list, with 0 size.
     */
    public void clear() {
        head = null;
        tail = null;
        currentSize = 0;
    }

    /**
     * Reverses the list and prints it out.
     */
    public void reverse() {
        Node<E> tmp = tail;
        System.out.print("[ ");
        while(tmp != null) {
            System.out.print(tmp.data + "," + " ");
            tmp = tmp.prev;
        }
        System.out.print("]\n");
    }

    /**
     * Checks whether the list contains given element or not.
     * @param element which existence will be checked
     * @return true, if element is present in list, and false if not
     */
    public boolean contains(E element){
        Node<E> tmp = head;
        while (tmp != null){
            if (tmp.data.equals(element)){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    /**
     * Clones the list into new list.
     */
    public void clone(MyCustomLinkedList<E> list) {
        Node<E> tmp = head;
        Node<E> newTmp;
        while(tmp != null) {
            newTmp = tmp;
            list.addFirst(newTmp.data);
            tmp = tmp.next;
        }
    }

    /**
     * Prints out the list.
     */
    public void print() {
        Node<E> tmp = head;
        System.out.print("[ ");
        while(tmp != null) {
            System.out.print(tmp.data + "," + " ");
            tmp = tmp.next;
        }
        System.out.print("]\n");
    }


}
