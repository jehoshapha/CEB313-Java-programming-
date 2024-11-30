public class Employee {
    private final String firstName;
    private final String lastName;
    private final double salary;

    // Constructor to initialize the instance variables
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = Math.max(salary, 0.0); // Ensure salary is non-negative
    }

    // Getters for the instance variables
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("John", "Doe", 50000.00);
        Employee emp2 = new Employee("Jane", "Smith", 60000.00);

        // Displaying Employee information
        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName() + ", Salary: $" + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName() + ", Salary: $" + emp2.getSalary());
    }
}
