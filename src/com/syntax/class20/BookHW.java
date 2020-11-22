package com.syntax.class20;

public class BookHW {
    String title;
    int pages;
    char bestseller;
    String author;

    BookHW(String title, String author, int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    BookHW(String title, String author, int pages, char bestseller){
        this(title, author, pages);
        this.bestseller=bestseller;
    }
    void print(){
        System.out.println("The book "+title+" is written by "+author+". It has "+pages+" pages. Is it a bestseller? "+bestseller);
    }

    public static void main(String[] args) {
        BookHW book=new BookHW("Harry Potter", "K.J.Rowling", 650);
        BookHW book2=new BookHW("Lolita", "Nabokov", 250, 'Y');
        book.print();
        book2.print();
    }
}
