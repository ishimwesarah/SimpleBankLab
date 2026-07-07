import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankService bankService = new BankService();

        boolean running = true;


        while (running) {

            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {

                case 1:

                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.println("Choose account type:");
                    System.out.println("1. Savings");
                    System.out.println("2. Current");

                    int typeChoice = scanner.nextInt();

                    AccountType accountType;

                    if (typeChoice == 1) {
                        accountType = AccountType.SAVINGS;
                    } else {
                        accountType = AccountType.CURRENT;
                    }

                    bankService.createAccount(name, accountType);

                    break;


                case 2:

                    System.out.print("Enter account number: ");
                     int accountNumber = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                     bankService.depositMoney(accountNumber, amount);

                        break;


                case 3:

                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();

                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    bankService.withdrawMoney(withdrawAccountNumber, withdrawAmount);

                    break;


                case 4:

                    System.out.print("Enter account number: ");
                    int viewAccountNumber = scanner.nextInt();
                    bankService.viewAccount(viewAccountNumber);
                    break;


                case 5:

                    running = false;
                    System.out.println("Thank you for using SimpleBank.");
                    break; 

                default:

                    System.out.println("Invalid option.");

            }
        }


        scanner.close();

    }
}