package org.example.maven_homework1;
import com.bdg.CustomArrays;
import java.util.Arrays;

public class LibUsing {

    public static void main(String[] args) {
        CustomArrays arr = new CustomArrays();

        int[] a = {1, 2 , 3, -254, -2, -7 ,-8, 0, 582};
        short[] b = {1, 2 , 3, -254, -2, -7 ,-8, 0, 582};
        arr.printPositiveNumbers(a);


        arr.printReversedArray(b);
    }
}
