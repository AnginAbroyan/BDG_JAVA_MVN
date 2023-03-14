package algorithms2;

import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class Algorithms {
    Scanner myScanner = new Scanner(System.in);

    /**
     * mulTable method prompts the user to input a positive integer.
     * It then prints the multiplication table of that number.
     */
    public void mulTable() {
        System.out.println("Please enter a positive number: ");
        int num = myScanner.nextInt();
        long multiple = 1;


        if (num <= 0) {
            System.out.println("Only positive numbers acceptable. ");
        }
        for (int count = 1; count <= 10; count++) {
            multiple = count * num;
            System.out.println(count + " * " + num + " = " + multiple);
        }
    }

    /**
     * raisePower method finds the value of one number raised to the power of another.
     */
    public void raisePower() {
        System.out.println("Please enter an int number that will be raised to the power: ");
        int a = myScanner.nextInt();
        System.out.println("Please enter an int number by which will be raised to the power: ");
        int b = myScanner.nextInt();
        int power = 1;
        int newNumb = 1;
        for (int i = 1; i <= b; i++) {
            power = a * newNumb;
            newNumb = power;
        }
        System.out.println(a + " power raised by " + b + " is equal to " + newNumb);
    }

    /**
     * reverseInt method prompts the user to input an integer and then outputs the number with the digits reversed.
     * For example, if the input is 12345, the output will be 54321
     */
    public void reverseInt() {
        System.out.println("Please enter an int number: ");
        int a = myScanner.nextInt();

        while (a > 0) {
            System.out.print(a % 10 + " ");
            a /= 10;
        }
    }

    /**
     * isPrime method prompts the user to input a positive integer.
     * It then outputs a message indicating whether the number is a prime number.
     * @returns true or false  depending on the number is prime or not.
     */
    public boolean isPrime() {
        System.out.println("Please enter a positive int number: ");
        int a = myScanner.nextInt();
        boolean prime = false;

        if (a % 2 == 0) {
            return prime;
        }
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            while (a % i == 0) {
                a = a / i;
                return prime;
            }
        }
        return !prime;
    }


    /**
     * loopAgain method returns the sum of two numbers. Loop repeats if user wants to continue inputting numbers to
     * calculate the sum again.
     */
    public void loopAgain() {
        boolean answer;
        do {
            System.out.println("Please enter two numbers: ");
            int a = myScanner.nextInt();
            int b = myScanner.nextInt();
            int sum = a + b;
            System.out.println("The sum of the given numbers is " + sum);
            System.out.println("Do you want to run the program again? (If yes, type true, otherwise false) ");
            answer = myScanner.nextBoolean();
        }
        while (answer == true);
    }

    /**
     * countNumb method prompts the user to enter numbers till he/she wants and at the end
     * it should display the count of positive, negative and zeros entered.
     */
    public void countNumb() {
        boolean answer;
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        do {
            System.out.println("Please enter a number: ");
            int a = myScanner.nextInt();
            System.out.println("Do you want to enter a new number? (If yes, type true, otherwise false) ");
            answer = myScanner.nextBoolean();
            if (a > 0) {
                countPos++;
            } else if (a < 0) {
                countNeg++;
            } else {
                countZero++;
            }
        }
        while (!answer);
        System.out.println("You entered " + countPos + " positive numbers, " + countZero + " zeros and " + countNeg
                + " negative numbers");
    }

    /**
     * numbMaxMin method prompts the user to enter numbers till he/she wants and at the end
     * the program should display the largest and smallest numbers entered.
     */
    public void numbMaxMin() {
        boolean answer;
        long maxNumb = Long.MIN_VALUE;
        long minNumb = Long.MAX_VALUE;
        do {
            System.out.println("Please enter a number: ");
            int a = myScanner.nextInt();
            System.out.println("Do you want to enter a new number? (If yes, type true, otherwise false) ");
            answer = myScanner.nextBoolean();
            if (a > maxNumb) {
                maxNumb = a;
            }
            if (a < minNumb) {
                minNumb = a;
            }
        }
        while (!answer);
        System.out.println("The largest number entered is " + maxNumb + " and the smallest number entered is " + minNumb);
    }

    /**
     * isArmstrong method calculates whether the given number is an Armstrong number or not.
     */
    public void isArmstrong() {
        int num;
        int remainder;
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            num = i;
            while (num != 0) {
                remainder = num % 10;
                sum += Math.pow(remainder, 3);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
            sum = 0;

        }
    }

    /**
     * sumSeries method calculates the sum of the following series: 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n .
     */
    public void sumSeries() {
        System.out.println("Enter a number: ");
        int n = myScanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        System.out.println(sum);
    }

    /**
     * ln2 method computes the natural logarithm of 2, by adding up to n terms in the series
     * 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
     * where n is a positive integer and input by user.
     */
    public void ln2() {
        System.out.println("Enter a number: ");
        int n = myScanner.nextInt();
        double ln2Sum = 0;
        for (int i = 1; i <= n; i += 2) {
            ln2Sum += (double) 1 / i;
        }
        for (int i = 2; i <= n; i += 2) {
            ln2Sum -= (double) 1 / i;
        }
        System.out.println(ln2Sum);
    }

    /**
     *guessNumber method generates a random number and asks the user to guess what the number is. If the user's guess
     * is higher than the random number, the program should display "Too high, try again."
     * If the user's guess is lower than the random number, the program should display "Too low, try again."
     * The program should use a loop that repeats until the user correctly guesses the random number.
     */
    public void guessNumber() {
        Random rand = new Random();
        int m = rand.nextInt();
        System.out.println(m);
        System.out.println("Guess the number: ");
        int n = myScanner.nextInt();
        do {
            if (n > m) {
                System.out.println("Guess again, too high. ");
            } else if (n < m) {
                System.out.println("Guess again, too low. ");
            } else {
                System.out.println("Guessed the number.");
            }
            n = myScanner.nextInt();
        }
        while (n != m);
    }

    /**
     * the method prints out a square made of  '*'.
     * **********
     * **********
     * **********
     * **********
     */
    public void putChar1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println(' ');
        }
    }

    /**
     *    *
     *    **
     *    ***
     *    ****
     *    *****
     */
    public void putChar2() {
        int colRows = 5;
        for (int i = 0; i <= colRows - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /**
     *            *
     *          **
     *        ***
     *      ****
     *    *****
     */
    public void putChar3() {
        int colRows = 5;
        int i, j;
        for (i = 0; i < colRows; i++) {
            for (j = 0; j < colRows - i; j++) {
                System.out.print(' ');
            }
            for (j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /**
     *         *
     *        ***
     *       *****
     *      *******
     *     *********
     */
    public void putChar4() {
        int i, j;
        int rows = 5;
        int stars = 1;
        for (i = rows; i >= 1; i--) {
            for (j = i - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= stars; j++) {
                System.out.print('*');
            }
            stars += 2;
            System.out.println();
        }
    }

    /**
     *         1
     *        222
     *       33333
     *      4444444
     *     555555555
     */
    public void putChar5() {
        int i, j;
        int rows = 5;
        for (i = 1; i <= rows; i++) {
            for (j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j < 2 * i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     *         1
     *        212
     *       32123
     *      4321234
     *     543212345
     */
    public void putChar6() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * The method calculates the factorial of the given number.
     * @param n, number which factorial will be calculated.
     * @returns the factorial.
     */
    public int factorial(int n){
        int fact = 1;
        for (int i = 1; i<= n; i++){
            fact *= i;
        }
        return fact;
    }

    /**
     * The method calculates sineX with the series sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
     */
    public void sinX(){
        System.out.println("Enter the degree of the angle to calculate sin(x): ");
        int x = myScanner.nextInt();
        System.out.println("Enter the number of the terms: ");
        int n = myScanner.nextInt();
        double radians = Math.toRadians(x);
        double sine = 0.0;
        double currentN = 0.0;
        int pow = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                currentN = -Math.pow(radians, pow) / factorial(pow);
            } else {
                currentN = Math.pow(radians, pow) / factorial(pow);
            }
            sine = sine + currentN;
            pow += 2;
        }
        System.out.println(sine);
    }

    /**
     * The method calculates cosine X with the series cos x = 1 - x2/2! + x4/4! - x6/6! .....
     */
    public void cosineX(){
        System.out.println("Enter the degree of the angle to calculate cosine(x): ");
        int x = myScanner.nextInt();
        System.out.println("Enter the number of the terms: ");
        int n = myScanner.nextInt();
        double radians = Math.toRadians(x);
        double cosine = 0.0;
        double currentN = 0.0;
        int pow = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                currentN = -Math.pow(radians, pow) / factorial(pow);
            } else {
                currentN = Math.pow(radians, pow) / factorial(pow);
            }
            cosine += currentN;
            pow += 2;
        }
        System.out.println(cosine);
    }

    /**
     * multi method  multiplies even numbers from 10 to the number entered.
     */
    void multi() {
        System.out.println("Please enter the N number: ");
        int n = myScanner.nextInt();
        BigInteger product = new BigInteger(String.valueOf(1));
        for (int i = 10; i <= n; i += 2) {
            product = product.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(product);
    }
}
