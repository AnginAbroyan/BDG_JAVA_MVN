package org.example.enum2.pizza;


import java.util.Scanner;

public enum PizzaSize {
    SMALL(7),
    MEDIUM(13),
    LARGE(18);

    public int priceSize;

    PizzaSize(int price) {
        this.priceSize = price;
    }


    Scanner sc = new Scanner(System.in);

    /**
     * This method calculates the pizza price depending on the size.
     *
     * @returns only pizza price without toppings.
     */
    public int sizePriceCalculator() {
        System.out.println("Please choose the size of the pizza. (SMALL, LARGE, MEDIUM) ");
        String input = sc.nextLine().toUpperCase();
        int priceSize = 0;

        if (input.equals(SMALL.toString())) {
            priceSize = SMALL.priceSize;
        }
        if (input.equals(MEDIUM.toString())) {
            priceSize = MEDIUM.priceSize;
        }
        if (input.equals(LARGE.toString())) {
            priceSize = LARGE.priceSize;
        }
        return priceSize;
    }
}
