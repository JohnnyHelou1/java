package com.johnny.training;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int libraryCardNumber;
    private List<Book> checkedOutBooks;

    public Member(String name , int libraryCardNumber){
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.checkedOutBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public List<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void setCheckedOutBooks(List<Book> checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }
    public boolean canCheckOutBooks (){
        return checkedOutBooks.size() < 5;
    }
}
