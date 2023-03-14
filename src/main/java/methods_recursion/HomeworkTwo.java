package methods_recursion;

import java.util.Scanner;

public class HomeworkTwo {

    Scanner myScanner = new Scanner(System.in);

    int number1(int a, int b) {
        return 0;
    }

    void number2() {
    }

    void number3(boolean input) {
        System.out.print("Hello World!!!");
    }

    char number4(char a) {

        return a;
    }

    float number5(float a, float b) {
        return a;
    }

    int x = 0;

    void number6() {
        x++;
        if (x < 5) {
            number6();
        }
    }
}
