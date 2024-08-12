package com.ais;

public class Question5 {
    private String title;
    private String author;
    private String isbn;

    
    public Question5(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
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

    
    public String getIsbn() {
        return isbn;
    }

   
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   
    public static void main(String[] args) {
       
        Question5 book = new Question5("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

       
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());

      
        book.setTitle("The Greatest Gatsby");
        book.setAuthor("Fitzgerald");
        book.setIsbn("1234567890");

    
        System.out.println("\nUpdated Book Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
    }
}
