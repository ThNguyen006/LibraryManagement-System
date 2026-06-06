
package borrowandreturnmanageroop;


public class BorrowRecord {



    private String borrowId;
    private String memberId;
    private String bookId;
    private int quantity;
      private int borrowDay;
    private int returnDay;
    private boolean returned;

    public BorrowRecord(String borrowId, String memberId, String bookId,
            int quantity, int borrowDay) {

        this.borrowId = borrowId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.quantity = quantity;
        this.borrowDay = borrowDay;
        this.returned = false;
    }

    public String getBorrowId() {
        return this.borrowId;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getBookId() {
        return this.bookId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getBorrowDay() {
        return this.borrowDay;
    }

    public int getReturnDay() {
        return this.returnDay;
    }

    public boolean isReturned() {
        return this.returned;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void returnBook(int returnDay) {
        this.returnDay = returnDay;
        this.returned = true;
    }

    public int calculateFine() {

        int total = this.returnDay - this.borrowDay;

        if (total > 7) {
            return (total - 7) * 5000;
        }

        return 0;
    }
}
    

