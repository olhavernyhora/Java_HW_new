package com.epam.model;

import java.util.Arrays;
import java.util.Comparator;

public class Books {
    private Book[] library;
    private int counter = 0;

    public Books(int index) {
        library = new Book[index];
    }

    public boolean createNewBook(Book book) {
        if (counter >= library.length) {
            return false;
        }
        library[counter++] = book;
        return true;
    }

    public String printLibrary() {
        if (counter == 0) {
            return "There are no books in the library!";
        }
        String books = "";
        for (int i = 0; i < counter; i++) {
                books += library[i].toString();
                books += "\n";
            }
        return books;
    }

    public void changePrice(double percent) {
        for (int i = 0; i < counter; i++) {
            library[i].changePrice(percent);
        }
    }

    public Books searchAuthor(String author) {
        Books newLibrary = new Books(counter);
        for (int i = 0; i < counter; i++) {
            if (library[i].getAuthor().equalsIgnoreCase(author)) {
                newLibrary.createNewBook(library[i]);
            }
        }
        return newLibrary;
    }

    public Books searchPublishDate(int year) {
        Books newLibrary = new Books(counter);
    for (int i = 0; i < counter; i++) {
            if (library[i].getYearPublished() > year) {
                newLibrary.createNewBook(library[i]);
            }
        }
        return newLibrary;
    }

    public Book[] sortByAuthor(){
        Book[] booksCopy = Arrays.copyOf(library,counter);
        Arrays.sort(booksCopy, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        return booksCopy;
    }

    public Book[] sortByPublisher(){
        Book[] booksCopy = Arrays.copyOf(library,counter);
        Arrays.sort(booksCopy, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublisher().compareTo(o2.getPublisher());
            }
        });
        return booksCopy;
    }

    public Book[] sortByYear(){
        Book[] booksCopy = Arrays.copyOf(library,counter);
        Arrays.sort(booksCopy, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) return -1;
                if (o1.getPrice() < o2.getPrice()) return 1;
                return 0;
            }
        });
        return booksCopy;
    }
}