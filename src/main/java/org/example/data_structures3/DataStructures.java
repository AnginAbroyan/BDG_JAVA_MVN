package org.example.data_structures3;

import java.util.*;

public class DataStructures {
    Scanner sc = new Scanner(System.in);



    /**
     * 1. HashSet: A: Write a program that takes two HashSets of integers and finds the common elements between them.
     * Gives all common Integer items fom two hashsets.
     *
     * @return a set with only common elements.
     */
    public Set<Integer> commonItems(Set<Integer> set1, Set<Integer> set2) {
        set2.retainAll(set1);
        return set2;
    }

    /**
     * 1. HashSet: B:	Create a HashSet of custom objects with a name and age field. Then, write a comparator
     * to sort the objects by age and print out the objects in order of increasing age.
     * Gives sorted version of hashset of books.
     */
    public ArrayList<Book> incrSort(HashSet<Book> set) {
        ArrayList<Book> arrSorted = new ArrayList<>(set);
        Collections.sort(arrSorted);
        for(Book value: arrSorted){
            System.out.println(value);
        }
        return arrSorted;
    }


    /**
     * 1. HashSet: C:	Write a program that takes a HashSet of strings and returns a new HashSet containing only the unique
     * words in the original set, ignoring case.
     * Gives only unique String elements fom a HashSet.
     */

    public HashSet<String> uniqueHashSet(HashSet<String> set){
        HashSet<String> setCaseInsensitive = new HashSet<>();
        for(String val: set){
            setCaseInsensitive.add(val.toLowerCase());
        }
        System.out.println(setCaseInsensitive);
        return setCaseInsensitive;
    }



    /**
     * EX 2A: LinkedHashSet: Write a program that takes in a LinkedHashSet of integers and removes any even
     * numbers from the set.
     * Removes all even numbers from LinkedHashSet.
     */

    public LinkedHashSet<Integer> noEvenNumbers(LinkedHashSet<Integer> set){
        set.removeIf(val -> val % 2 == 0);
        System.out.println(set);
        return set;
    }

    /**
     * LinkedHashSet 2B:	Create a LinkedHashSet of custom objects with a name and age field. Then, write a
     * comparator to sort the objects by age and print out the objects in order of increasing age.
     *Returns LinkedHashSet sorted by the year of book publication.
     */

    public ArrayList<Book> sort(LinkedHashSet<Book> set){
        ArrayList<Book> arrSorted = new ArrayList<>(set);
        Collections.sort(arrSorted);
        for(Book value: arrSorted){
            System.out.println(value);
        }
        return arrSorted;
    }


    /** -------------does not work----------
     * LinkedHashSet 2C.	Write a program that takes in a LinkedHashSet of custom objects and removes any
     * objects that have a duplicate name field.
     *
     */

    public LinkedHashSet<Book> uniqueBook(LinkedHashSet<Book> set){
        LinkedHashSet<Book> uniqueBooks = new LinkedHashSet<>();
        LinkedHashSet<String> titles = new LinkedHashSet<>();
        for(Book book: set){
            if(!titles.contains(book.getTitle())){
                uniqueBooks.add(book);
                titles.add(book.getTitle());
            }
        }
        return uniqueBooks;
    }



    public static void main(String[] args) {
        DataStructures obj = new DataStructures();

        //EX1.A
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(1);
//        set2.add(2);
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//        System.out.println(obj.commonItems(set1, set2));



        //EX 1B
//        HashSet<Book> set = new HashSet<>();
//
//        set.add(new Book("Dune Messiah", 1969));
//        set.add(new Book("Children of Dune", 1976));
//        set.add(new Book("Dune", 1965));
//        obj.incrSort(set);

        //EX   1C
//        HashSet<String> set = new HashSet<>();
//        set.add("Green");
//        set.add("Green");
//        set.add("green");
//        set.add("Red");
//
//        obj.uniqueHashSet(set);


        //EX 2A
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.add(6);
//        obj.noEvenNumbers(set);

        //EX  2B

//        LinkedHashSet<Book> set = new LinkedHashSet<>();
//
//        set.add(new Book("Dune Messiah", 1969));
//        set.add(new Book("Children of Dune", 1976));
//        set.add(new Book("Dune", 1965));
//        obj.sort(set);

        //EX 2C
        LinkedHashSet<Book> set = new LinkedHashSet<>();

        set.add(new Book("Dune Messiah", 1969));
        set.add(new Book("Dune Messiah", 1969));
        set.add(new Book("Children of Dune", 1976));
        set.add(new Book("Children of Dune", 1976));
        set.add(new Book("Dune", 1965));
        set.add(new Book("Dune", 1965));
        obj.incrSort(set);

        obj.uniqueBook(set);
    }
}
