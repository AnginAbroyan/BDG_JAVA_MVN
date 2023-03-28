package org.example.data_structures2;

import org.example.data_structures2.MyCustomQueue;

public class MainQueue {
    public static void main(String[] args) {
        MyCustomQueue<Integer> nums = new MyCustomQueue<>();
        nums.enQueue(2);
        nums.enQueue(3);
        nums.enQueue(4);
        nums.enQueue(5);
        nums.displayQueue();
        System.out.println();
        nums.deQueue(3);
        nums.displayQueue();
        System.out.println(nums.isEmpty());
        System.out.println(nums.size());
    }

}
