package project.oop.CS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.table.DefaultTableModel;

public class Book {
    String name,author,cat;
    int price,quentty;
    DefaultTableModel Book;
    BufferedReader r;
    BufferedWriter w;
    public Book(String name, String author, String cat, int price, int quentty) {
        this.name = name;
        this.author = author;
        this.cat = cat;
        this.price = price;
        this.quentty = quentty;                
    }
    public void AddBook(String name, String author, String cat, int price, int quentty) {
        this.name = name;
        this.author = author;
        this.cat = cat;
        this.price = price;
        this.quentty = quentty;
    }
    void Load(){
        Book=new DefaultTableModel();
        Book.addColumn("Name");
        Book.addColumn("Author");
        Book.addColumn("Cat");
        Book.addColumn("Price");
        Book.addColumn("Quentty");
        
    }
}
