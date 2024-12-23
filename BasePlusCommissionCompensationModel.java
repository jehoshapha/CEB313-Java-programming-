public class BasePlusCommissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double commissionRate;     //Instance variable
    private double baseSalary;

     

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        //creating a constructor 
        this.grossSales = grossSales;

        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    @Override //making use of polymorphism 
    public double earnings() {
        return baseSalary + (grossSales * commissionRate);
    }
}