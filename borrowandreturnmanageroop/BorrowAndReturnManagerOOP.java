
package borrowandreturnmanageroop;

import java.util.Scanner;


public class BorrowAndReturnManagerOOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BorrowManager manager = new BorrowManager();
        
        while (true){
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Show Borrowing List");
            System.out.println("4. Borrowing History");
            System.out.println("5. Update Quantity");
            System.out.println("0. Exit"); 
             System.out.println("==========================");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    manager.borrowBook();
                    break;

                case 2:
                    manager.returnBook();
                    break;

                case 3:
                    manager.showBorrowingList();
                    break;

                case 4:
                    manager.borrowingHistory();
                    break;

                case 5:
                    manager.updateQuantity();
                    break;

                case 0:
                    System.out.println("Exit!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
            
    }
    
}
