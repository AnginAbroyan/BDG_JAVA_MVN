package org.example.data_structures2;


public class MyCustomQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     *Inner class for Nodes fields.
     */
    private static class Node<E>{
        private final E data;
        private Node<E> next;

        public Node(E data){
            super();
            this.data = data;
            next = null;
        }
    }

    /**
     * Checks whether the list is empty or not.
     * @return true if empty, and false if not
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * @return the size of the list.
     */
    public int size(){
        return size;
    }

    /**
     * Adds elements to the list from the end.
     * @param obj will be added to the list.
     */
    public void enQueue(E obj){
        if(isEmpty()){
            head = tail = new Node<>(obj);
            size++;
            return;
        }
        tail.next = new Node<>(obj);
        tail = tail.next;
        size++;
    }

    /**
     * Removes the elements fom the start of the list.
     * @param obj will be removed from the list
     * @return removed element fom the list
     */
    public E deQueue(E obj){
        if(!isEmpty()){
            E res = head.data;
            head = head.next;
            size--;
            return res;
        }
        return null;
    }

    /**
     * Displays list elements.
     */
    public void displayQueue(){
        Node<E> node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


}
