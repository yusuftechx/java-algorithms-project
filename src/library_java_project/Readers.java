package library_java_project;

public class Readers extends Library {
    String dateBorrow;
    int readerID;

    Readers(String bookName, String authorName, int quantity, String dateBorrow, int readerID) {
        super(bookName, authorName, quantity);
        this.dateBorrow = dateBorrow;
        this.readerID = readerID;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Date Borrow :" + dateBorrow);
        System.out.println("reader ID " + readerID);
    }
}
