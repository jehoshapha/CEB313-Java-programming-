public class SavingsAccountTest {
    public static void main(String[] args) {
        // Instantiate two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        // Set initial balances for the savers
        saver1.savingsBalance = 2000.00;
        saver2.savingsBalance = 3000.00;

        // Set the annual interest rate to 4% and calculate interest for 12 months
        SavingsAccount.modifyInterestRate(0.04);
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        // Print the new balances after 12 months
        System.out.println("Saver1 Balance after 12 months: " + saver1.savingsBalance);
        System.out.println("Saver2 Balance after 12 months: " + saver2.savingsBalance);

        // Set the annual interest rate to 5% and calculate interest for the next month
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Print the new balances after 13 months
        System.out.println("Saver1 Balance after 13 months: " + saver1.savingsBalance);
        System.out.println("Saver2 Balance after 13 months: " + saver2.savingsBalance);
    }}