package org.example.data_structures3;

public class Book implements Comparable {
    private String title;
    private int year;


    public Book(String title, int year){
        this.title = title;
        this.year = year;
    }
    public Book(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return Integer.compare(this.year, book.year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
