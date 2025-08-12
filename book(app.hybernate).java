package com.rohan.college.attancance1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private int bookId;

    @Column(name = "book_name", nullable = false, length = 100) // Example column mapping
    private String bookName;


    // Default constructor is mandatory for JPA
    public Book() {
    }

    // Constructor for easy object creation
    public Book(String bookName, String author) {
        this.bookName = bookName;
          }

    // Getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

   

}
