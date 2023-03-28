package org.example.data_structures2;

public class MyCustomDeque<E> {
    private MyCustomDeque.Node<E> head;
    private MyCustomDeque.Node<E> tail;
    private int size;

    /**
     * Inner class for nodes.
     */
    private static class Node<E>{
        private final E data;
        private MyCustomDeque.Node<E> next;
        private MyCustomDeque.Node<E> prev;

        public Node(E data){
            super();
            this.data = data;
            next = null;
            prev = null;
        }
    }

    /**
     * Checks whether the deque is empty o not.
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }



}
