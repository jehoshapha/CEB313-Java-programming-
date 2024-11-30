import java.math.BigDecimal;

public class Account {
    private String accountName; // Account holder's name
    private BigDecimal balance; // Account balance

    // Constructor initializes accountName and balance
    public Account(String accountName, BigDecimal balance) {
        this.accountName = accountName;
        this.balance = balance.max(BigDecimal.ZERO); // Ensure non-negative balance
    }

    // Method to deposit (add) an amount to the balance
    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(depositAmount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw (subtract) an amount from the balance
    public void withdraw(BigDecimal withdrawalAmount) {
        if (withdrawalAmount.compareTo(BigDecimal.ZERO) > 0 && withdrawalAmount.compareTo(balance) <= 0) {
            balance = balance.subtract(withdrawalAmount);
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance.");
        }
    }

    // Method to get the current balance
    public BigDecimal getBalance() {
        return balance;
    }

    // Method to get the account name
    public String getAccountName() {
        return accountName;
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Example usage
        Account account1 = new Account("Alice", new BigDecimal("1000.50"));
        Account account2 = new Account("Bob", new BigDecimal("500.00"));

        System.out.println(account1.getAccountName() + " balance: $" + account1.getBalance());
        System.out.println(account2.getAccountName() + " balance: $" + account2.getBalance());

        account1.deposit(new BigDecimal("250.75"));
        account2.withdraw(new BigDecimal("100.25"));

        System.out.println(account1.getAccountName() + " balance after deposit: $" + account1.getBalance());
        System.out.println(account2.getAccountName() + " balance after withdrawal: $" + account2.getBalance());
    }
}
