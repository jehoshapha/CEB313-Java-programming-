// Savings Account class
class SavingsAccount {
    private static double annualInterestRate; // Static variable to store annual interest rate
    double savingsBalance; // Instance variable for current balance

    // Method to calculate monthly interest based on current balance and annual interest rate
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
}





//This Java program provides a simple implementation of the SavingsAccount class for managing savings balances and calculating monthly interest based on an annual interest rate. It includes instantiation of account objects, setting initial balances, modifying interest rates, calculating interest for multiple months, and printing the resulting balances.