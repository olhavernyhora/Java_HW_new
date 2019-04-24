package com.epam.model;

public class Book {
    private static int nextId = 1;
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearPublished;
    private int numberPages;
    private double price;

    @Override
    public String toString() {
        return "Book" +
                " №" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearPublished=" + yearPublished +
                ", numberPages=" + numberPages +
                ", price=" + price;
    }

    public void changePrice(double percent) {
        this.price = price + price * percent/100;
    }

    public Book() {
        this.id = nextId++;
    }

    public Book(String name, String author, String publisher, int yearPublished, int numberPages, double price) {
        this();
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.numberPages = numberPages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
