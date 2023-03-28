package org.example.data_structures2;

import java.util.*;

public class DataStructures<T> {

    /**
     * EX1
     * Adds values to the queue
     */
    public Queue addQueue(Object data) {
        Queue queue = new LinkedList();
        queue.add(data);
        for (Object val : queue) {
            System.out.print(val + " ");
        }
        return queue;
    }

    /**
     * EX2
     * Implement a deque using LinkedList and add elements to it.
     *
     * @param data
     */
    public void addDeque(Object data) {
        Deque deque = new LinkedList();
        deque.add(data);
        for (Object val : deque) {
            System.out.print(val + " ");
        }
    }

    /**
     * EX3
     * Create a priority queue of integers and add elements to it
     */
    public void addPQ() {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(100);
        priorityQueue.add(11);
        priorityQueue.add(120);
        priorityQueue.add(13);
        System.out.println(priorityQueue);
    }

    /**
     * EX4
     * Create a priority queue of strings and add elements to it.
     */
    public void addPQStrings() {
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Peach");
        priorityQueue.add("Apple");
        priorityQueue.add("Blueberry");
        priorityQueue.add("Melon");
        System.out.println(priorityQueue);
    }

    /**
     * EX5
     * 5.	Create a deque using ArrayDeque and add elements to it.
     */
    public void addArrDeque() {
        Deque deque = new ArrayDeque();
        deque.add("Green");
        deque.add("Red");
        deque.add("Blue");
        System.out.println(deque);
    }


    /**
     * 6.	Create a priority queue of custom objects and add elements to it.
     */
    public void addPQCustom() {
        PriorityQueue<Object> pq = new PriorityQueue<>();
        pq.add(560);
        pq.add(1000);
        pq.add(50);
    }

    /**
     * 7.	Remove elements from a queue until it is empty.
     */

    public void removeAll() {
        Queue pq = new LinkedList();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        do {
            pq.remove();
        }
        while (!pq.isEmpty());
        for (Object val : pq) {
            System.out.print(val + " ");
        }
    }

    /**
     * EX8 8.	Remove elements from a deque until it is empty.
     */
    public void removeAllDeque() {
        Deque list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        do {
            list.remove();
        }
        while (!list.isEmpty());
    }

    /**
     * EX9 10	Check if an element is present in a queue.
     */

    public boolean isPresent() {
        PriorityQueue<Object> pq = new PriorityQueue<>();
        pq.add(560);
        pq.add(1000);
        pq.add(50);
        return pq.contains(560);

    }

    /**
     * Not written
     * 11.	Using the Queue<T> class write a program to print  its first 50 members for given N.
     * N = 1,3,5,7,9,…
     */

//    public void first50() {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(50);
//        int count = 1;
//
//        while (count <= 50) {
//            queue.add(n);
//        }
//    }

    /**
     * 12.	Write a Java program to create a new priority queue, add some colors (string) and print out
     * the elements of the priority queue.
     */
    public void colorsPQ() {
        PriorityQueue<Object> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Blue");
        pq.add("Green");
        pq.add("Yellow");
        pq.add("Pink");
        pq.add("Grey");
        System.out.println(pq);
    }

    /**
     * 13.	Write a Java program to add all the elements of a priority queue to another priority queue.
     */

    public void transfer() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Blue");
        pq.add("Green");
        pq.add("Yellow");
        pq.add("Pink");
        pq.add("Grey");
        Iterator<String> iterator = pq.iterator();
        while (iterator.hasNext()) {
            pq1.add(iterator.next());
        }
        System.out.println(pq1);
    }

    /**
     * 14.	Write a Java program to retrieve and remove the first element.
     */

    public void retrieveRemoveFirst() {
        Queue list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.poll());

        System.out.println(list);
    }

    /**
     * 15.	Write a Java program to change priorityQueue to maximum priorityqueue.
     */
    public void pqToMaxPQ() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(10, Collections.reverseOrder());
        pq.add(12);
        pq.add(25);
        pq.add(33);
        pq.add(31);
        pq.add(18);
        pq.add(50);
        pq.add(52);
        pq.add(62);
        pq.add(11);
        System.out.println(pq);

        Integer tmp = null;
        while ((tmp = pq.poll()) != null) {
            System.out.print(tmp + "  ");
        }
    }



    public static void main(String[] args) {

        DataStructures dataStructures = new DataStructures();


    }
}
