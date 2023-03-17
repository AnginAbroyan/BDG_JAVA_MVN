package org.example.methods_recursion;

import java.util.Scanner;

public class HomeworkTwo {

    Scanner myScanner = new Scanner(System.in);

    /**
     * Method gets par a and b and returns 0.
     */
   public int number1(int a, int b) {
        return 0;
    }

    /**
     * Method returns nothing.
     */
    public void number2() {
        System.out.println("Returning nothing");
    }

    /**
     * Method gets boolean parameter and prints Hello World.
     * @param input
     */
    public void number3(boolean input) {
        System.out.print("Hello World!!!");
    }

    /**
     * Method get char parameter and return it.
     */
    public char number4(char a) {

        return a;
    }

    /**
     * Method get two float parameters and returns one of them.
     */
    public float number5(float a, float b) {
        return a;
    }



    /**
     * A method demonstrates how recursion works. A method call inside method body.
     */
    int x = 0;
    int count = 0;
    public int number6() {
        x++;
        if (x < 5) {
            count++;
            number6();
        }
        return count;
    }
}
