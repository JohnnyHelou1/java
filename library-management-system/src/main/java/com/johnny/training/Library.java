package com.johnny.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> allBooks;
    public static Map<Member , List<Book>> checkedOutBooks;

    public Library(){
        allBooks = new ArrayList<>();
        checkedOutBooks = new HashMap<>();
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> allBooks) {
        this.allBooks = allBooks;
    }

    public Map<Member, List<Book>> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void setCheckedOutBooks(Map<Member, List<Book>> checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }
    public void addBook (Book book){
        allBooks.add(book);
    }
    public List<Book> searchByTitle(String title){
        List<Book> result = new ArrayList<>();
        for(Book book : allBooks){
            if(book.getTitle().equalsIgnoreCase(title)){
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchByAuthor(String author){
        List<Book> result = new ArrayList<>();
        for(Book book : allBooks){
            if(book.getAuthor().equalsIgnoreCase(author)){
                result.add(book);
            }
        }
        return result;
    }
    public Book searchByISBN(int ISBN){
        for(Book book : allBooks){
            if(book.getISBN() == ISBN)
            {
                return book;
            }
        }
        return null;
    }

    public boolean checkOutBook(Member member , Book book)
    {
        if(book.isAvailable() && member.canCheckOutBooks()){
            book.checkOut();
            List<Book> memberCheckedOutBooks = checkedOutBooks.getOrDefault(member, new ArrayList<>());
            memberCheckedOutBooks.add(book);
            checkedOutBooks.put(member, memberCheckedOutBooks);
            return true;

        }
        return false;
    }
    public boolean returnBook(Member member, Book book) {
        if (checkedOutBooks.containsKey(member) && checkedOutBooks.get(member).contains(book)) {
            book.checkIn();
            List<Book> memberCheckedOutBooks = checkedOutBooks.get(member);
            memberCheckedOutBooks.remove(book);
            checkedOutBooks.put(member, memberCheckedOutBooks);
            return true;
        }
        return false;
    }
}

