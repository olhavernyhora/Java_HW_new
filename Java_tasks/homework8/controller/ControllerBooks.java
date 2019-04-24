package com.epam.controller;

import com.epam.model.Book;
import com.epam.model.Books;
import com.epam.util.InputUtil;
import com.epam.view.ViewBooks;

import java.util.Arrays;

public class ControllerBooks {
    private Books library;

    public void run() {

        ViewBooks.print(ViewBooks.ENTER_NUMBER);
        int libraryLength = InputUtil.inputLibSize();
        library = new Books(libraryLength);

        // filling library with books
        Book book1 = new Book("Book", "Some Great Author", "Shevchenko Print",
                2010, 140, 60);
        Book book2 = new Book( "Gone with the Wind", "Margaret Mitchell",
                "Hall", 1948, 546, 300);
        Book book3 = new Book( "Sherlock Holmes", "Arthur Conan Doyle",
                "Britannica", 1995, 289, 450);
        Book book4 = new Book( "Beyond the City", "Arthur Conan Doyle",
                "Britannica", 1892, 325, 160);
        Book book5 = new Book( "Hamlet", "William Shakespeare", "London Print",
                1990, 169, 289 );
        Book book6 = new Book( "Romeo and Juliet", "William Shakespeare", "Heritage Press",
                1935, 125, 560 );

        boolean[] addedBooks = {library.createNewBook(book1),
                library.createNewBook(book2),
                library.createNewBook(book3),
                library.createNewBook(book4),
                library.createNewBook(book5),
                library.createNewBook(book6)};

        // printing the message indicating what books were added to the library
        ViewBooks.printMessage(ViewBooks.ADDED_BOOKS,
                Arrays.toString(addedBooks));

        ViewBooks.print(library.printLibrary());

        // changing the price using indicated percentage
        ViewBooks.print(ViewBooks.ENTER_DISCOUNT);
        library.changePrice(InputUtil.inputPercent());
        ViewBooks.print(library.printLibrary());

        // search by the author
        ViewBooks.print(ViewBooks.ENTER_AUTHOR);
        Books searchBooksAuthor = library.searchAuthor(InputUtil.inputAuthor());
        ViewBooks.print(searchBooksAuthor.printLibrary());

        // search by the year book was published
        ViewBooks.print(ViewBooks.ENTER_YEAR);
        Books searchYear = library.searchPublishDate(InputUtil.inputSearchYear());
        ViewBooks.print(searchYear.printLibrary());

        // sorting
        ViewBooks.print("Library sorted by Author -->");
        ViewBooks.printSortedLibrary(library.sortByAuthor());
        ViewBooks.print("Library sorted by Publisher -->");
        ViewBooks.printSortedLibrary(library.sortByPublisher());
        ViewBooks.print("Library sorted by Published year -->");
        ViewBooks.printSortedLibrary(library.sortByYear());

        //checking that our initial library stayed the same after sorting
        ViewBooks.print("Our initial library by the order books were added to it");
        ViewBooks.print(library.printLibrary());
    }
}
