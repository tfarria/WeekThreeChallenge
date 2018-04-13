package com.company;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String year;
    private String number;
    ArrayList<Book> bookList;
    ArrayList<Borrow> borrowList;

    public Book() {
        bookList = new ArrayList<>();
        borrowList = new ArrayList<>();
    }

    public Book(String title, String author, String year, String number) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.number = number;
        bookList = new ArrayList<>();
        borrowList = new ArrayList<>();

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    public void addBook(Book b){
        this.bookList.add(b);
    }

    public ArrayList<Borrow> getBorrowList() {
        return borrowList;
    }

    public void setBorrowList(ArrayList<Borrow> borrowList) {
        this.borrowList = borrowList;
    }
    public void addBorrow(Borrow bl) {
        this.borrowList.add(bl);
    }

    }
