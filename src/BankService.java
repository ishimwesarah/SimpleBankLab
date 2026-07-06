import java.util.ArrayList;

public class BankService {

    private ArrayList<BankAccount> accounts;
    private int nextAccountNumber;


    // Constructor
    public BankService() {
        accounts = new ArrayList<>();
        nextAccountNumber = 1001;
    }


    // Create a new bank account
    public void createAccount(String ownerName, AccountType accountType) {

        BankAccount account = new BankAccount(
                nextAccountNumber,
                ownerName,
                accountType
        );

        accounts.add(account);

        System.out.println("[INFO] Account created successfully.");

        account.displayAccount();

        nextAccountNumber++;
    }


    // Find account using account number
    public BankAccount findAccount(int accountNumber) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

}