package org.example.enum2.seasons;

import java.util.Scanner;

public enum Season {
    SPRING(3, 10),
    SUMMER(11, 35),
    FALL(-3, 3),
    WINTER(-20, -4);


    public int high;
    public int low;

    Season(int low, int high){
        this.low = low;
        this.high = high;
    }


    Scanner sc = new Scanner(System.in);

    /**
     * This method finds the typical season for the given temperature.
     */
    public void checkSeason(){
        System.out.println("Please enter a valid temperature in Celsius to check the corresponding season: ");
        int input = sc.nextInt();

        if (input >= SPRING.low && input <= SPRING.high){
            System.out.println(input + " Celsius temperature is typical to " + SPRING.toString());

        }
        if (input >= SUMMER.low && input <= SUMMER.high){
            System.out.println(input + " Celsius temperature is typical to " + SUMMER.toString());

        }
        if (input >= FALL.low && input <= FALL.high){
            System.out.println(input + " Celsius temperature is typical to " + FALL.toString());

        }
        if (input >= WINTER.low && input <= WINTER.high){
            System.out.println(input + " Celsius temperature is typical to " + WINTER.toString());

        }
        else{
            System.out.println("Please enter a valid temperature.");
        }
    }
}
