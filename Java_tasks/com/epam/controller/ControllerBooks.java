package com.epam.controller;

import com.epam.model.Book;
import com.epam.model.Books;
import com.epam.util.InputUtil;
import com.epam.view.ViewBooks;

import java.util.Arrays;

public class ControllerBooks {
    private Books library;
    private ViewBooks viewBooks = new ViewBooks();

    public void run() {
        viewBooks.print("Enter size of your library ->");
        library = new Books(InputUtil.inputInt());

//        наполнение библиотеки книгами
        Book book1 = new Book("Jane Eyre", "Charlotte Bronte", "Smith, Elder & Co.",
                1980, 345, 245);
        Book book2 = new Book( "Gone with the Wind", "Margaret Mitchell",
                "Hall", 1948, 546, 300);
        Book book3 = new Book( "Sherlock Holmes", "Arthur Conan Doyle",
                "Britannica", 1995, 289, 450);
        Book book4 = new Book( "Sherlock Holmes Part 2", "Arthur Conan Doyle",
                "Britannica", 2000, 325, 160);
        Book book5 = new Book( "Hamlet", "William Shakespeare", "London Print",
                1990, 169, 289 );
        Book book6 = new Book( "Romeo and Juliet", "William Shakespeare", "Heritage Press",
                1935, 125, 560 );

        boolean[] success = {library.createNewBook(book1),
                             library.createNewBook(book2),
                             library.createNewBook(book3),
                             library.createNewBook(book4),
                             library.createNewBook(book5),
                             library.createNewBook(book6)};

//        проверка, какие книги были добавлены с учетом максимального размера библиотеки
        viewBooks.printMessage("Only books with status 'true' were added to the library",
                Arrays.toString(success));

        viewBooks.print(library.printLibrary());

//        запрос на процент

        viewBooks.print(viewBooks.ENTER_DISCOUNT);
        library.changePrice(InputUtil.inputPercent());
        viewBooks.print(library.printLibrary());

//        запрос на автора

        viewBooks.print(ViewBooks.ENTER_AUTHOR);
        Books searchBooksAuthor = library.searchAuthor(InputUtil.inputAuthor());
        viewBooks.print(searchBooksAuthor.printLibrary());

//        запрос на год публикации

        viewBooks.print(viewBooks.ENTER_YEAR);
        Books searchYear = library.searchPublishDate(InputUtil.inputInt());
        viewBooks.print(searchYear.printLibrary());
    }
}
