package com.johnny.training;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main (String[] args){
        Library Antoine = new Library();

        //Adding Books to the library
        Book book1 = new Book("Game of Thrones","Lewis Hamilton " , 0001);
        Book book2 = new Book("Anna Karinina","Ashab" , 0002);
        Book book3 = new Book("Chaperon Rouge","Le lion" , 0003);
        Book book4 = new Book("Layla wal ze2eb","Asaad " , 0004);

        Antoine.addBook(book1);
        Antoine.addBook(book2);
        Antoine.addBook(book3);
        Antoine.addBook(book4);

        Member member1 = new Member("Johnny" , 1);
        Member member2 = new Member("Joe" , 2);

        Antoine.checkOutBook(member1 , book1);
        Antoine.checkOutBook(member1,book2);
        Antoine.checkOutBook(member1 , book3);
        Antoine.checkOutBook(member1,book4);

        System.out.println("Checked out books for Johnny before returning any book");
        List<Book> checkedOutBooks = Library.checkedOutBooks.getOrDefault(member1, new ArrayList<>());
        for (Book book : checkedOutBooks) {
            System.out.println("Member " + member1.getName() + " has checked out: " + book);
        }
        Antoine.returnBook(member1 , book2);
        Antoine.returnBook(member1, book3);
        System.out.println("Checked out books for johnny after returning book2 and book3");
        for (Book book : checkedOutBooks) {
            System.out.println("Member " + member1.getName() + " has checked out: " + book);
        }


    }
}
