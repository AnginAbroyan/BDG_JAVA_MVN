package org.example.algorithms3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms3Test {
    Algorithms3 obj = new Algorithms3();

    int[] arr = {105, 100, 256, 80, 75, 65, 55, 45, 44, 23, 107, 3, 2, 1};
    int[] sortedArr = { 1, 2, 3, 23,44,45,55,65,75,80,100,105,107,256};
    @Test
    void bubbleSort() {
        assertArrayEquals(sortedArr, obj.bubbleSort(arr));

    }

    @Test
    void selectionSort() {
        assertArrayEquals(sortedArr, obj.selectionSort(arr));
    }

    @Test
    void insertionSort() {
        assertArrayEquals(sortedArr, obj.insertionSort(arr));
    }

}