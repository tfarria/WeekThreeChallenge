package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookTitle;
        Borrow borrow;
        Book b;
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Borrow> borrowList = new ArrayList<>();
        boolean stop = false;
        boolean finish = false;
        boolean end = false;
        boolean next = false;

            do {


            showMenu2();


            switch (Integer.valueOf(scanner.nextLine())) {
                case 1:

                do {

                    System.out.println("Add a Book. ");
                    System.out.println("*****************************************************");
                    b = new Book();
                    System.out.println("Book Title ? : ");
                    b.setTitle(scanner.nextLine());
                    System.out.println("Author ? : ");
                    b.setAuthor(scanner.nextLine());
                    System.out.println("Year Book was Published ? : ");
                    b.setYear(scanner.nextLine());
                    System.out.println("Enter ISBN Number : ");
                    b.setNumber(scanner.nextLine());
                    bookList.add(b);
                    System.out.println("Enter another Book ?  Y/N " );
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
                        stop = true;
                } while (!stop);


                showMenu2();

                switch (Integer.valueOf(scanner.nextLine())) {
                    case 2:
                        do {


                            showBookList(bookList);
                            System.out.println("Return to Add a Book ?  Y/N ");
                            String answerNext = scanner.nextLine();
                            if (answerNext.equalsIgnoreCase("No")||answerNext.equalsIgnoreCase("N"))
                                next = true;
                        }while (!next);


                    case 3:

                        do {

                            System.out.println("Borrow A Book");
                            System.out.println("**************************");
                            showBookList(bookList);
                            System.out.println("Enter Book Title : ");
                            bookTitle = scanner.nextLine();
                            for (Book eachBook : bookList) {
                                if (eachBook.getTitle().equalsIgnoreCase(bookTitle))
                                    b = eachBook;
                            }

                            bookList.remove(b.getTitle() + b.getAuthor() + b.getYear() + b.getNumber());


                            borrow = new Borrow();
                            borrow.setBorrowed(bookTitle);
                            borrowList.add(borrow);
                            showBorrowList(borrowList);
                            System.out.println("Borrow another Book ? :");
                            String answerBorrow = scanner.nextLine();
                            if (answerBorrow.equalsIgnoreCase("No") || answerBorrow.equalsIgnoreCase("N"))
                                finish = true;


                        } while (!finish);

                }







                            }





                }while (!end);



            }





    public static void showMenu(){
        System.out.println("1) Add a Book. ");

    }
    public static void showMenu2(){
        System.out.println("1) Add a Book. ");
        System.out.println("2) See Book List. ");
        System.out.println("3) Borrow a Book. ");
    }

    public static void showBookList(ArrayList<Book> bookList){
        for (Book book : bookList){
            System.out.println("BOOK TITLE :"+" "+ book.getTitle());
            System.out.println("AUTHOR : "+" "+ book.getAuthor());
            System.out.println("YEAR PUBLISHED :"+" "+ book.getYear());
            System.out.println("ISBN NUMBER :"+" "+ book.getNumber());
            System.out.println("=====================================");
        }
    }
    public static void showBorrowList(ArrayList<Borrow> borrowList){
        for (Borrow borrow : borrowList){
            System.out.println("BORROWED BOOKS : "+" "+ borrow.getBorrowed());
        }
    }
    public static Book addBook(String name){
        Book b = new Book();
        return b;
    }
    public static Borrow addBorrow(String name){
        Borrow borrow = new Borrow();
        return borrow;
    }

}
