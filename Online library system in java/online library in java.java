package com.javafull;
//Online Library system Developed By Rick saha
class OnlineLibraryMgmt{

    String[] books;
    int no_of_books;


//    constructor non parametrized
    OnlineLibraryMgmt()
    {
        this.books = new String[100];
        this.no_of_books=0;
    }

    public void addBook(String book)
    {
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " has been Added!");
    }

    public void showAvailableBookInLibrary()
    {
        System.out.println("All Available books list are:-");
        for (String book:this.books)
        {
            if (book == null)
            {
               continue;
            }
            System.out.println("* "+book);
        }
    }

    void issueBooks(String book)
    {
        for (int i=0;i<this.books.length;i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println(book+"The book has been issued!");
                this.books[i]= null;
                return;
            }

        }
        System.out.println("This Book not Found in Available list!");
    }

    void returnBooks(String book)
    {
        this.books[no_of_books] = book;
        addBook(book);
    }

}


public class lec61 {
    public static void main(String[] args) {
        OnlineLibraryMgmt on = new OnlineLibraryMgmt();
        on.addBook("java");
        on.addBook("c");
        on.addBook("c++");
        on.addBook("python");
        on.addBook("DBMS");
        on.addBook("Networking");

        System.out.println();
        on.showAvailableBookInLibrary();

        System.out.println();

        on.issueBooks("c++");
        on.issueBooks("java");


        System.out.println();
        on.showAvailableBookInLibrary();

        System.out.println();
        on.returnBooks("c++");
        on.showAvailableBookInLibrary();
        
    }
}