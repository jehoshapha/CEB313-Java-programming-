// Define the Complex class for performing arithmetic with complex numbers
public class Complex {
    // Private floating-point variables to represent the real and imaginary parts
    private double realPart;
    private double imaginaryPart;

    // Constructor to initialize the complex number with specified real and imaginary parts
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // No-argument constructor with default values
    public Complex() {
        this(0.0, 0.0); // Default to 0 + 0i
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double newRealPart = this.realPart + other.realPart;
        double newImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        double newRealPart = this.realPart - other.realPart;
        double newImaginaryPart = this.imaginaryPart - other.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Method to print the complex number in the form (realPart, imaginaryPart)
    public void print() {
        System.out.println("(" + this.realPart + ", " + this.imaginaryPart + ")");
    }

    // Main method to test the Complex class
    public static void main(String[] args) {
        // Create complex numbers using both constructors
        Complex c1 = new Complex(3.0, 4.0); // 3 + 4i
        Complex c2 = new Complex(1.5, 2.5); // 1.5 + 2.5i

        // Print the original complex numbers
        System.out.print("c1: ");
        c1.print();
        System.out.print("c2: ");
        c2.print();

        // Add the complex numbers and print the result
        Complex sum = c1.add(c2);
        System.out.print("c1 + c2: ");
        sum.print();

        // Subtract the complex numbers and print the result
        Complex difference = c1.subtract(c2);
        System.out.print("c1 - c2: ");
        difference.print();

        // Create a complex number using the no-argument constructor
        Complex c3 = new Complex(); // 0 + 0i
        System.out.print("c3 (default): ");
        c3.print();
    }
}
