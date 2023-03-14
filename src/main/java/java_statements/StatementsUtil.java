package javastatements;

import java.util.Scanner;

public class StatementsUtil {
    Scanner myScanner = new Scanner(System.in);

    void number1() {
        System.out.println("Please enter a number: ");
        int a = myScanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("The given number is even.");
        } else {
            System.out.println("The given number is odd.");
        }
    }


    void number2() {
        System.out.println("Please enter a number: ");
        int a = myScanner.nextInt();

        if (a < 0) {
            System.out.println(a + " is a negative number.");
        } else if (a > 0) {
            System.out.println(a + " is a positive number.");
        } else {
            System.out.println("0 is neither positive nor negative number.");
        }
    }

    void number3() {
        System.out.println("Please enter a number: ");
        int x = myScanner.nextInt();
        if (((5 < x) && (x < 8)) || ((15 < x) && (x < 20))) {
            System.out.println(x + " is smaller than 8 and greater than 5 or is smaller than 15 and greater than 20.");
        } else {
            System.out.println("The number is not from the given interval.");
        }
    }


    void number4() {
        System.out.println("Please enter a number: ");
        int a = myScanner.nextInt();
        if ((a % 5 == 0) && (a % 7 == 0)) {
            System.out.println(a + " is a divisor to both 5 and 7.");
        } else if (a % 5 == 0) {
            System.out.println(a + " is a divisor only to 5.");
        } else if (a % 7 == 0) {
            System.out.println(a + " is a divisor only to 7.");
        } else {
            System.out.println(a + " is neither a divisor to 5 or to 7.");
        }
    }

    public boolean number5() {
        System.out.println("Please enter a number: ");
        int a = myScanner.nextInt();
        int x = a / 10 % 10;
        if (x == 7) {
            return true;
        } else {
            return false;
        }
    }

    void number6() {
        System.out.println("Please enter the coordinate: ");
        int x = myScanner.nextInt();
        int y = myScanner.nextInt();
        int x1 = 0;
        int y1 = 0;
        int r = 5;
        if ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) < r * r) {
            System.out.println("The point is inside the circle.");
        } else if ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) == r * r) {
            System.out.println("The point is on the circle.");
        } else if ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) > r * r) {
            System.out.println("The point is outside the circle.");
        }
    }

    void number7() {
        System.out.println("Please enter the numbers: ");
        int x = myScanner.nextInt();
        int y = myScanner.nextInt();
        int z = myScanner.nextInt();
        if (x > y && x > z) {
            System.out.println("The greatest of the numbers is " + x);
        }
        if (y > x && y > z) {
            System.out.println("The greatest of the numbers is " + y);
        }
        if (z > y && z > x) {
            System.out.println("The greatest of the numbers is " + z);
        }
    }


    void number8() {
        System.out.println("Please enter the year: ");
        int year = myScanner.nextInt();
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }



  /* Ex. 9
      int x = 0;
      while (x++ < 10) {
        if(x == 8){
            break;
        }
      }
      System.out.println(x);




 Ex. 10.1
      int x = 2;              Because x is always smaller than 10, while loop will be infinite. I added x++, to make
          int y = 5;          the loop go until x<10.
         while(x < 10) {
          x++;
          y++;
          }



Ex. 10.2
            int x = 15;
            while (x > 10) {
              x = --x;           This was a infinite loop, because x was always 15. I just changed x-- into --x.
            }
            System.out.println(x);

*/

    void number11() {
        int x = 1;
        while (x < 201) {
            System.out.println(x);
            x++;
        }
    }


    void number12() {
        System.out.println("Please enter a number: ");
        int a = myScanner.nextInt();
        int first_digit;
        while (a >= 10) {
            a /= 10;
        }
        System.out.println("The first digit of the given number is " + a);
    }


    void number13() {
        int x = 1;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y++;
        }
    }

    /**
     * A method to draw a square with * symbols.
     * int sideSize is the side size of the square.
     * int i is being used for columns
     * int j is being used for rows.
     */
    void number14(){
        System.out.println("Please enter the side size: ");
        int sideSize = myScanner.nextInt();
        int i = 0;
        int j;
        while (i < sideSize)
        {
            j = 0;
            while(j < sideSize){
                if(i == 0 || i == sideSize - 1 || j == 0 || j == sideSize - 1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    void number15() {
        System.out.println("Please enter the N number: ");
        int n = myScanner.nextInt();
        int sum = 0;
        int m = n;
        while (m != 4) {
            if(m % 10 == 0 || m % 10 == 5) {
                sum += m;
            }
            m--;
        }
        System.out.println("The sum of the numbers from 1 to " + n + " that are divisors to 5, is " + sum + ".");
    }


    void number16(){
        System.out.println("Please enter the N number: ");
        int n = myScanner.nextInt();
        long multiplication = 1;
        int m = n;
        while(m != 9){
            if(m % 2 == 0 && m < 99){
                multiplication *= m;
            }
            m--;
        }
        System.out.println("The multiplication of the even numbers from 10 to " + n + " that are double digit " +
                "is equal to " + multiplication);

    }

    void number17(){
        System.out.println("Please enter the N number: ");
        int n = myScanner.nextInt();
        long arMean = (n + 1)/2;
        System.out.println("The arithmetic mean of 1 and " + n + " is " + arMean);
    }


    void number18(){
        System.out.println("Please enter a 5 digit number: ");
        int n = myScanner.nextInt();
        int sumDigit = n % 10 + n / 10 % 10 + n / 100 % 10 + n / 1000 % 10 +n / 10000 % 10;
        System.out.println("The sum of " + n + "'s digits is equal to " + sumDigit);
    }
}











