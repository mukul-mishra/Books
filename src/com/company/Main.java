package com.company;

import java.util.Scanner;

 class Books {
    protected String bookname;
    protected String author;
    protected String isbn;

    public String getBookname() {
        return bookname;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    Books(String bookname,String isbn,String author) {
        this.bookname = bookname;
        this.isbn = isbn;
        this.author = author;
    }
    @Override
    public String toString() {
        return "__________________________________" +
                "\nBook Nmae:\t" + getBookname() +
                "\nAuthor Name:\t" + getAuthor() +
                "\nISBN:\t" + getIsbn() +
                "\n__________________________________";
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nu = scanner.nextInt();
        scanner.nextLine();
        Books[] books = new Books[nu];
        for(int i = 0;i < nu;i++) {
            String b = scanner.nextLine();
            String a = scanner.nextLine();
            String c = scanner.nextLine();
            books[i] = new Books(b,a,c);
        }
        for(int i = 0;i < books.length;i++) {
            System.out.println(books[i]);
        }
    }
}

