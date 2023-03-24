package org.example.data_structures1;


import java.sql.Array;
import java.util.Collections;
import java.util.List;

public class Main<T> {
    public static void main(String[] args) {
        MyCustomArrayList obj = new MyCustomArrayList<>();

        MyCustomArrayList<String> str = new MyCustomArrayList<>();
        str.add("Test N1");
        str.add("Test N2");
        str.add("Test N3");
        str.addAtFirst("Test N4 will be added at the first position of my ArrayList.");
        str.set(2, "New Test N2");





        for(String value: str){
            System.out.println(value);
        }
        System.out.println("-------------");
        String a  ="Test N1";
        System.out.println(str.search(a));









    }
}
