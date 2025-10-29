package org.example.TemaDin18Octombrie;


class Author {
    private final String name;
    private final String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}


class Book {
    private final String name;
    private final int year;
    private final Author author;
    private final double price;

    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}


public class Library {
    public static void main(String[] args) {

        Author author = new Author("Stefan Tanasa", "stefantanasa@mail.com");

        Book book = new Book("Java de la 0 la expert", 2007, author, 158.00);


        System.out.println(
                "Book " + book.getName() + " (" + book.getPrice() + " RON), by "
                        + book.getAuthor().getName() + ", published in " + book.getYear()
        );
    }
}
