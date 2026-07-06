import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankService bankService = new BankService();

        boolean running = true;


        while (running) {

            System.out.println("\n===== SIMPLE BANK =====");
            System.out.println("1. Create Account");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");

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