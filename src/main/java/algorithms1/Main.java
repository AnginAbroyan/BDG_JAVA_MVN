package algorithms1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Algorithms ricePackProblem = new Algorithms();
        boolean result = ricePackProblem.ricePack(2, 3, 16);
        System.out.println(result);


        Algorithms largestPrimeFactor = new Algorithms();
        long largestPrime = largestPrimeFactor.largestPrimeFactor();
        System.out.println("The largest prime factor of the given number is " + largestPrime);


        Algorithms odd_even = new Algorithms();
        odd_even.odd_even();


        Algorithms number4 = new Algorithms();
        number4.max_min_Rand();
    }
}