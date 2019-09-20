package main;
import java.util.Scanner;
public class BookStore {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Book[] books = new Book[n];
        for(int i = 0 ; i < n ; i++){
            String bookName = scanner.nextLine().trim();
            String authorName = scanner.nextLine().trim();
            String isbn = scanner.nextLine().trim();
            books[i] = new Book(bookName, authorName, isbn);
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println(books[i].toString());
        }
    }
}
class Book{
    private String bookName;
    private String authorName;
    private String isbn;
    public String getBookName(){
        return bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public Book(String bookName, String authorName, String isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
    }
     public String toString(){
        return "-----------------------------\n" +
                "Book Name:     "+bookName+
                "\nAuthor Name:     "+authorName+
                "\nISBN:            "+isbn+
                "\n-----------------------------";

    }
}
