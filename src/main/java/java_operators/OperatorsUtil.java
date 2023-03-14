package javaoperators;

import java.util.Scanner;

public class OperatorsUtil {
    public static void main(String[] args) {
        //Arithmetic Operators Ex. 1
/*
        int a = 8;
        int b = 6;
        System.out.println("a + b = " + (a+b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a % b = " + (a%b));

        //Ex. 2
        double c = 6.4;
        double d = 0.03;
        System.out.println("c + d = " + (c+d));
        System.out.println("c * d = " + (c*d));
        System.out.println("c / d = " + (c/d));
        System.out.println("c - d = " + (c-d));
        System.out.println("c % d = " + (c%d));

        //Ex. 3
        int i;
        int j;
        System.out.println("I = " + (2 * (((5 + 3) * 4) - 8)));
        System.out.println("J = " + (2 * 5 + 3 * 4 - 8));

        //Unary operators
        //EX. 4
        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        //Ex. 4.9
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);




        //Assignment Operator
        //Ex. 5

        int x = (int)1.0;
        System.out.println(x);

        short y = (short)1921222;
        System.out.println(y);
        System.out.println(2147483647+1);   // int overflow


        //Ex. 5.4


        long x;
        long y = (x = 3);
        System.out.println(y);



        //Ex 5.5

        boolean y = false;
        boolean x = (y = true);
        System.out.println(x);


        //Rational Operators
        // Ex. 6
        int aa = 10;
        int bb = 20;
        System.out.println(aa<bb);
        System.out.println(aa<=bb);
        System.out.println(aa>=bb);
        System.out.println(aa>bb);


        Additional tasks EX. 7

        1)  float y = 2.1f;    float type should be indicated at the end of the number.


        2)  byte x = 5;
            byte y = 10;
            byte z = (byte)(x + y);

        3)   short x = 10;
             short y = 3;
             short z = (short)(x * y);



        4)   long x = 10;
             int y = 5;
             y = (int)(y * x);




        // Ex. 8

        int a = 10;
        int b = 5;
        int c = a;
        a = b;
        b = c;
        System.out.println("a: " + a);
        System.out.println("b: " + b);




        //Ex. 9
        int a = 10;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);


        // Ex. 10
        int count = 100;
        int add_first_last = 101;
        int total_sum = add_first_last*count/2;
        System.out.println(total_sum);
        */

        //Bitwise & Logical Operators
        //Ex. 1

        int a = 8;
        int b = 3;
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(true || (a < 4));
        System.out.println((b >= 6) || (++a <= 7));
        System.out.println((a<b)?a:b);
        System.out.println(b^b);


        //Shift Operator
        //Ex. 1
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);




        //Ex. 2

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int x = myScanner.nextInt();
        System.out.println(x + " * 8 = " + (x << 3));
        System.out.println(x + " * 16 = " + (x << 4));

    }
}
