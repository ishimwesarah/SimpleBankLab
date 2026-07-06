public class BankAccount {

    private int accountNumber;
    private String ownerName;
    private AccountType accountType;
    private double balance;

    public BankAccount(int accountNumber, String ownerName, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.accountType = accountType;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void displayAccount() {
        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }
}