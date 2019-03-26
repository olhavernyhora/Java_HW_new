package com.epam.model;

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
                books += library[i].view();
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
}