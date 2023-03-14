package primitive_data_types;

import java.util.Scanner;

public class Homework {


    Scanner myScanner = new Scanner(System.in);

    void number1() {
        System.out.println("Please enter your numbers: ");
        byte a = myScanner.nextByte();
        byte b = myScanner.nextByte();


        System.out.print("a: " + a + ", b: " + b);
    }

    void number2() {
        System.out.println("Please enter your numbers: ");
        short c = myScanner.nextShort();
        short d = myScanner.nextShort();
        System.out.print("c: " + c + "\nd: " + d);
    }

    void number3() {
        int e = myScanner.nextInt();
        int f = myScanner.nextInt();
        System.out.print("e: " + e + "\nf: " + f);
    }

    void number4() {
        long g = myScanner.nextLong();
        long h = myScanner.nextLong();
        System.out.print("g: " + g + "\nh: " + h);
    }

    void number5() {
        byte min_byte = Byte.MIN_VALUE;
        byte max_byte = Byte.MAX_VALUE;
        short min_short = -32768;
        short max_short = 32767;
        int min_int = -2147483648;
        int max_int = 2147483647;
        long min_long = Long.MIN_VALUE;
        long max_long = Long.MAX_VALUE;
        System.out.print("Minimum byte value is " + min_byte + " and maximum byte value is " + max_byte + ".\n");
        System.out.print("Minimum shot value is " + min_short + " and maximum shot value is " + max_short + ".\n");
        System.out.print("Minimum int value is " + min_int + " and maximum int value is " + max_int + ".\n");
        System.out.print("Minimum long value is " + min_long + " and maximum long value is " + max_long + ".");
    }

    void number6() {
        float j = myScanner.nextFloat();
        float k = myScanner.nextFloat();
        System.out.print("j: " + j + "\nk: " + k);

    }

    void number7() {
        double l = myScanner.nextDouble();
        double m = myScanner.nextDouble();
        System.out.print("L: " + l + "\nM: " + m);

    }

    void number8() {
        float min_float = Float.MIN_VALUE;
        float max_float = Float.MAX_VALUE;
        double min_double = 2.2250738585072014E-308d;
        double max_double = 1.7976931348623158E+308d;
        System.out.print("Minimum float value is " + min_float + " and maximum float value is " + max_float + ".\n");
        System.out.print("Minimum double value is " + min_double + " and maximum double value is " + max_double + ".");
    }

    void number10() {
        char n = (char) myScanner.nextInt();
        char o = (char) myScanner.nextInt();
        System.out.print("n: " + n + "\no: " + o);
    }

    void number11_1() {
        char s = 77;
        char w = 109;
        System.out.print("s: " + s + "\nw: " + w);
    }

    void number11_2() {
        char t = 57;
        System.out.print("t: " + t);
    }

    void number12() {
        boolean p = true;
        boolean q = false;
        System.out.print("The value of p is: " + p);
        System.out.print("\nThe value of q is: " + q);
    }

    void number14() {
        int aa = 7;
        long bb = aa;
        System.out.print(bb);
    }

    void number15() {
        int myInt = 7;
        double myDouble = myInt;
        System.out.print(myDouble);
    }

    void number16() {
        double dd = 9.78d;
        int ii = (int) 9.78d;
        System.out.print(ii);

    }

    void number17() {
        int ff = 9999;
        byte gg = (byte) 9999;
        System.out.print(gg);
    }

/*
Exercise 9
12.345 and 3456.091 can be referred to float data type.
34.567839023 and 8923.1234857 can be referred to double data types.

Exercise 13
int year = 201l;
System.out.print (year);
The code will not compile, because we could have lost some information if it had been converted from long to int.


Exercise 18

long max = 3123456789L;        (added L)
double d = 1000_00;            (removed .)
char i =’i’; char j=’j’; char ij = (char)(i +j);
int a7 = 8;                    (variable name should not start with a number)
long h = 0; h = h  + 8;        (at fist we should initialize the variable)
int n, m = 11; n = m;          (because m was initialized and n had not any value)

 */

}
