package borrowandreturnmanageroop;

import java.util.ArrayList;
import java.util.Scanner;

public class BorrowManager {

    private ArrayList<BorrowRecord> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void borrowBook() {

        System.out.print("Enter Borrow ID: ");
        String borrowId = sc.nextLine();

        System.out.print("Enter Member ID: ");
        String memberId = sc.nextLine();

        System.out.print("Enter Book ID: ");
        String bookId = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity!");
            sc.nextLine();
            return;
        }

        System.out.print("Enter Borrow Day: ");
        int borrowDay = sc.nextInt();
        sc.nextLine();

        BorrowRecord record = new BorrowRecord(
                borrowId,
                memberId,
                bookId,
                quantity,
                borrowDay
        );

        list.add(record);

        System.out.println("Book borrowed successfully!");
    }

    public void returnBook() {

        System.out.print("Enter Borrow ID to return: ");
        String id = sc.nextLine(); 

        for (BorrowRecord record : list) {

            if (record.getBorrowId().equals(id)) {

                if (record.isReturned()) {
                    System.out.println("This book has already been returned!");
                    return;
                }

                System.out.print("Enter Return Day: ");
                int returnDay = sc.nextInt();
                sc.nextLine();

                record.returnBook(returnDay);

                if (returnDay - record.getBorrowDay() > 7) {
                    System.out.println("Book is overdue!");
                } else {
                    System.out.println("Book returned on time!");
                }

                System.out.println(
                        "Fine: " + record.calculateFine()
                );

                System.out.println("Book returned successfully!");
                return;
            }
        }

        System.out.println("Borrow record not found!");
    }

    public void updateQuantity() {

        System.out.print("Enter Borrow ID: ");
        String id = sc.nextLine();

        for (BorrowRecord record : list) {

            if (record.getBorrowId().equals(id)) {

                System.out.print("Enter New Quantity: ");
                int quantity = sc.nextInt();
                sc.nextLine();

                record.setQuantity(quantity);

                System.out.println("Quantity updated successfully!");
                return;
            }
        }

        System.out.println("Borrow record not found!");
    }

    public void showBorrowingList() {

        if (list.isEmpty()) {
            System.out.println("No data available!");
            return;
        }

        for (BorrowRecord record : list) {

            if (!record.isReturned()) {

                System.out.println("-------------------");
                System.out.println("Borrow ID: " + record.getBorrowId());
                System.out.println("Member ID: " + record.getMemberId());
                System.out.println("Book ID: " + record.getBookId());
                System.out.println("Quantity: " + record.getQuantity());
            }
        }
    }

    public void borrowingHistory() {

        if (list.isEmpty()) { 
            System.out.println("No data available!");
            return;
        }

        for (BorrowRecord record : list) {

            System.out.println("-------------------");
            System.out.println("Borrow ID: " + record.getBorrowId());
            System.out.println("Member ID: " + record.getMemberId());
            System.out.println("Book ID: " + record.getBookId());
            System.out.println("Quantity: " + record.getQuantity());
            System.out.println("Borrow Day: " + record.getBorrowDay());

            if (record.isReturned()) {

                System.out.println("Return Day: " + record.getReturnDay());
                System.out.println("Status: Returned");

            } else {

                System.out.println("Status: Borrowing");
            }
        }
    }
}