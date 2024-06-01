package library_java_project;

public class Library {
    String bookName;
    String authorName;
    int quantity;

    Library(String bookName, String authorName, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }
    void getDetails(){
        System.out.println("Book Name :" + bookName);
        System.out.println("Author Name :" + authorName);
    }
}
