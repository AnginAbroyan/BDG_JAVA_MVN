package enum2.pizza;

import java.util.Scanner;

public enum Topping {
    PEPPERONI(3),
    MUSHROOM(2),
    ONION(2),
    TOMATOES(2),
    SAUSAGE(2),
    PEPPER(2);


    public int priceTopping;

    Topping(int price) {
        this.priceTopping = price;
    }


    Scanner sc = new Scanner(System.in);

    /**
     * This method calculates pizza topping price depending on how many toppings are on the pizza.
     * @returns only toppings price.
     */
    public int toppingPriceCalculator() {

        System.out.println("How many toppings would you like? (PEPPERONI, MUSHROOM, ONION, TOMATOES, SAUSAGE) ");
        int input1 = sc.nextInt();
        int xEach = 2;
        int price = 1;
        int caunt = 5;

        for(int i = 1; i<= Topping.values().length; i++){
            if(input1 == caunt){
                price = caunt*xEach;
            }
            else{
                price--;
                caunt--;
            }
        }
        return price;
    }
}
