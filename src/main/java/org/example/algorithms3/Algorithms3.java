package org.example.algorithms3;

import java.util.Random;
import java.util.Scanner;

public class Algorithms3 {

    Scanner sc = new Scanner(System.in);


    int m = 4;
    int i = 0;

    /**
     * Methods prints out the given text n^n times.
     */
    public void nPowNTimesRepeat(int n) {
        i++;
        int count = 0;
        while (i < n) {
            m *= n;
            while (i <= m) {
                count++;
                System.out.println("Ես դուրս չեմ մնացել։");
                nPowNTimesRepeat(n);
            }
        }
        System.out.println(count);
    }



    /**
     * Creating an array by inputting numbers.
     *
     * @return the inputted array
     */
    public int[] createArrIn() {
        System.out.print("Please enter array length: ");
        int len = sc.nextInt(); // length of the array
        int[] arr = new int[len];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    /**
     * Creating an array from random numbers.
     */
    public int[] createRandArr() {
        Random rand = new Random();
        int[] arr = new int[7];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }

    public void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }


    /**
     * This method returns sorted version of the given array with complexity O(n)
     */
    public int[] bubbleSort(int[] arr) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return arr;
    }

    /**
     * This method sorts the given array with selection method.
     */
    public int[] selectionSort(int[] arr) {
        int min;

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[min] > arr[j]) {
                    min = j;
                }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    /**
     * Sorts the array by inserting each element in it exact place.
     */
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    /**
     * This method sorts the given array. At first, it divides the arr into subarray-s until their length is 1;
     * Then with the help of merge method it compares left and right sides of subarray-s and starts to insert the smaller
     * one into the sorted array;
     *
     * @param arr array which will be sorted
     */

    public void mergeSort(int[] arr) {
        int len = arr.length;
        if (arr.length < 2) {
            return;
        }
        int midIndex = len / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[len - midIndex]; // if the length is odd number
//        for(int i = 0; i<midIndex; i++){
//            leftArr[i] = arr[i];
//        }
//
//        for(int i = midIndex; i< arr.length; i++){
//            rightArr[i- midIndex] = arr[i];
//        }

        // creating left array by adding elements from initial array
        System.arraycopy(arr, 0, leftArr, 0, midIndex);

        if (arr.length - midIndex >= 0)
            System.arraycopy(arr, midIndex, rightArr, 0, arr.length - midIndex);

        mergeSort(rightArr);
        mergeSort(leftArr);

        merge(arr, leftArr, rightArr);

    }

    /**
     * This method compares left and right subarray-s elements and the smaller one inserts into sorted array.
     */
    public void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftLen = leftArr.length, rightLen = rightArr.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftLen) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightLen) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }

    /**
     * Method sorts the array, it picks the last element as a pivot and partitions the given array around the picked pivot.
     *
     * @param lowIndex  Starting index
     * @param highIndex Ending index
     */
    public void quickSort(int[] arr, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }
        int pivot = arr[highIndex];
        int leftPointer = lowIndex, rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);
        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    /**
     * A helper method to swap elements values.
     */
    public void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;

    }


    public void heapSort(int[] arr) {
        createHeap(arr);
        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);
            heapify(arr, j, 0);
        }
    }

    void createHeap(int[] arr) {
        int l = arr.length / 2 - 1;
        for (int i = l; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
    }

    void heapify(int[] heap, int length, int parent) {
        while (true) {
            int left = parent * 2 + 1;
            int right = parent * 2 + 2;
            int largestPos = parent;
            if (left < length && heap[left] > heap[largestPos]) {
                largestPos = left;
            }
            if (right < length && heap[right] > heap[largestPos]) {
                largestPos = right;
            }
            if (largestPos == parent) {
                break;
            }
            swap(heap, parent, largestPos);
            parent = largestPos;
        }
    }


//    public static void main(String[] args) {
//        Algorithms3 obj = new Algorithms3();
//        obj.nPowNTimesRepeat(3);

//        int[] arr = new int[]{5, 6, 7, 4, 3, 2, 1};

//        obj.printArr(obj.bubbleSort(arr));


//        obj.printArr(obj.selectionSort(ar));


//        obj.printArr(obj.insertionSort(arr));


//        obj.mergeSort(arr);
//        obj.printArr(arr);


//        obj.quickSort(arr, 0, arr.length-1);
//        obj.printArr(arr);


//        obj.heapSort(arr);
//        obj.printArr(arr);
//    }

}
