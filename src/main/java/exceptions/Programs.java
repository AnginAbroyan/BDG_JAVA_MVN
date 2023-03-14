package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programs extends Exception {
    Scanner sc = new Scanner(System.in);

    public Programs() {
    }

    public Programs(String message) {
        super(message);
    }

    public Programs(Throwable cause) {
        super(cause);
    }

    public Programs(String message, Throwable cause) {
        super(message, cause);
    }


    /**
     * EX1
     * Method gives the reciprocal of the given number.
     * Catches arithmetic exceptions.
     */
    public void intReciprocal() {
        double numReciprocal;
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        try {
            numReciprocal = 1 / number;
            System.out.println(numReciprocal);
        } catch (java.lang.ArithmeticException a) {
            System.out.println("Avoid dividing by zero. java.lang.ArithmeticException: / by zero");
        }
        sc.close();
    }


    /**
     * EX2
     * The method gets the int array length and then the elements, then sums up the values inputted.
     * Catches all Input Mismatch Exceptions.
     */

    public void sumIntArr() {
        System.out.print("Please enter the length of the array: ");
        int len = sc.nextInt();
        System.out.print("Please enter " + len + " int elements to calculate their sum. ");

        int[] arr = new int[len];
        int sum = 0;


        try {
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("The sum of the elements in the array is " + sum + ".");
        } catch (InputMismatchException e) {
            System.out.println("Inputted element should be an int. ");
        }
        sc.close();
    }


    /**
     * EX3 (SAME AS EX9)
     * Method divides num1 by num2, and output the result, it handles the case not letting to input 0.
     */

    public void division() {
        System.out.print("Please enter the divisor number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter the number: ");
        int num2 = sc.nextInt();
        int result;

        try {
            result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException a) {
            System.out.println("You should not divide a number by 0. ");
        }
        sc.close();
    }


    /**
     * ex4
     * The method reads from a file and prints out in the console, if the file does not exist or the given path is wrong,
     * the exception is thrown and being caught.
     */

    public void readPrintFile() {
        try {
            BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Serge\\gitaddece\\Java_Homeworks\\src\\exceptions\\input.txt"));
            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);

                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Couldn't track the file to read. ");
        }
    }


    /**
     * EX5
     * The method calculates the square root of the given number, if the inputted value does not have square root,
     * the exceptions are caught.
     */

    public void squareRoot() {
        System.out.println("Enter a number to calculate its square root: ");

        try {
            int n = sc.nextInt();
            double result = Math.sqrt(n);

            if (n < 0) {
                throw new Programs("NaN exception.");
            }
            System.out.println(result);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");

        } catch (Programs a) {
            System.out.println("NaN exception");
        } finally {
            System.out.println("Good bye");

        }
    }


    /**
     * EX6
     */


//    public void except() throws Exception{
//        try{
//            int len =sc.nextInt();
//            String[] line = new String[len];
//            for(int i = 0; i<len; i++){
//                line[i] = sc.nextLine();
//            }
//            throw new Programs("");
//
//        }
//        catch(){
//
//        }
//        catch(){
//
//        }
//        catch(){
//
//        }
//    }


    /**
     * EX7
     * The method gets the age if it's not smaller than 0 and not greater than 120. In that case exceptions are caught.
     */

    public void getAge() throws Exception {
        try {
            System.out.println("Please enter your age: ");
            int age = sc.nextInt();
            if (age >= 120 || age <= 1) {
                throw new Programs("InvalidAgeException");
            }
            sc.close();
            System.out.println("My age is: " + age);
        } catch (Programs a) {
            System.out.println("Exception message: " + a.getMessage());
        }
    }

    /**
     * EX8
     * The method checks whether the given mail address is legal or not. If not it throws an exception.
     */

    public void validEmail() throws Exception {
        System.out.println("Please enter your email address: ");
        String email = sc.nextLine();
        try {
            if (!(email.contains("@mail.com") && email.length() >= 10)) {
                throw new Programs("InvalidMailAddressException");
            }
            System.out.println("The given mail address is legal.");
        } catch (Programs a) {
            System.out.println("Exception message: " + a.getMessage());
        }
    }

    /**
     * EX10
     * The method counts the words in the document, if document is not trackable, if throws an exception.
     */
    public void wordCounter() throws Exception{
        try {
            BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Serge\\gitaddece\\Java_Homeworks\\src\\exceptions\\input.txt"));
            int i = input.read();
            int count = 1;

            while (i != -1) {
                if((char) i == ' ' || (char) i == '\n'){
                    count++;
                };

                i = input.read();
            }
            System.out.println("There are " + count + " words in the document.");

            input.close();
        } catch (Exception e) {
            System.out.println("Couldn't track the file to read. ");
        }
    }
}

