/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop;

/**
 *
 * @author lenovo v110
 */
class reader {
    String name;
    String password;
    String phone;
    String email;
    String address;
    String cardnumber;

    public reader(String name, String password, String phone, String email, String address, String cardnumber) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.cardnumber = cardnumber;
    }
    
     public reader get_reader()
     {
         return this;
     }
}
class book

{
    String name;
    String author;
    int price;
    String category;

    public book(String name, String author, int price, String category) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.category = category;
    }
    public book get_book()
    {
        return this;
    }
}
