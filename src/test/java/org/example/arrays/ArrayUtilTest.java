package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {
    ArrayUtil arr = new ArrayUtil();

    @Test
    void binToDec() {


        assertEquals(arr.binToDec(1010), 10);
        assertFalse(arr.binToDec(1011) == 10);
        assertTrue(arr.binToDec(11110001) == 241);
    }

    @Test
    void reverseArr() {
        short[] s = {1, 0, 2, -5, 0};
        short[] b = {0, -5, 2, 0, 1};
        assertArrayEquals(b, arr.reverseArr(s));
    }

    @Test
    void arrIntPos() {
        int[] n = {1, 0, 2, -5, -856, -95637, 256, 896};
        int[] m = {1, 2, 256, 896};
        assertArrayEquals(m, arr.arrIntPos(n));
    }


    @Test
    void maxArr(){
        long[] array = {1, 2, 5, 896, 54652, 999999, -256, -1};
        assertEquals(999999, arr.maxArr(array));
        assertNotEquals(54652, arr.maxArr(array));
    }

    @Test
    void minArr(){
        float[] array = {1, 2, 5, 896, 54652, 999999, -256, -1};
        assertEquals(-256, arr.minArr(array));
        assertNotEquals(54652, arr.minArr(array));
    }


    @Test
    void transferArr(){
        int[] n = {1, 2, 3, 4, 5, 6};
        int[] m = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(m, arr.transferArr(n));
    }

    @Test
    void sumArrays(){
        int[] a = {1, 5, 6, 4, 7};
        int[] b = {7, 4, 2, 3, 5};
        int[] c = {8, 9, 8, 7, 12};
        assertArrayEquals(c, arr.sumArrays(a, b));
    }

    @Test
    void countK(){
        int[] array = {1, 5, 6, 4, 5};
        assertTrue(2== arr.countK(5));
        assertFalse(3== arr.countK(6));
    }


    @Test
    void nonRepeatingTriplets(){
        int[] array = {1, 5, 6, 4};
        assertTrue(4== arr.nonRepeatingTriplets(array));
    }

    @Test
    void isEven(){
        int[][] a = {{1, -1, 0, 0},
                {2, -2, 1, -1},
                {9, 0, -1, -7}};
        int[][] b = {{1, -1, 0, 0},
                {2, -2, 1, -1},
                {9, 0, -1, -8}};
        assertNotEquals(true, arr.isEven(a));
        assertEquals(true, arr.isEven(b));
    }










}