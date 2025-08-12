package com.rohan.college.attancance1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Build SessionFactory (hibernate.cfg.xml should be in src/main/resources or classpath root)
        try (SessionFactory factory = new Configuration()
                .configure() // no file name needed if it's in the classpath
                .addAnnotatedClass(Book.class) // register your entity
                .buildSessionFactory()) {

            // Open a session and transaction
            try (Session session = factory.openSession()) {
                Transaction tx = session.beginTransaction();

                // Create and save a Book
                Book b1 = new Book();
                b1.setBookName("SQL");

                session.save(b1);

                tx.commit();

                System.out.println("Book saved successfully with ID: " + b1.getBookId());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
