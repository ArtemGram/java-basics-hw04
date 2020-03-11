public class SalariedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    public double fixedMonthlyPayment;
    public String socialSecurityNumber;
    public static double averageMonthlySalary;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        // TODO fill in code here
    }

    public String getSocialSecurityNumber() {
        // TODO fill in code here and replace the return statement
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        // TODO fill in code here
    }

    public double getFixedMonthlyPayment() {
        // TODO fill in code here and replace the return statement
        return fixedMonthlyPayment;
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return this.averageMonthlySalary;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        setAverageMonthlySalary(fixedMonthlyPayment);
    }

    public void setAverageMonthlySalary(double fixedMonthlyPayment) {
        this.averageMonthlySalary = fixedMonthlyPayment;
    }

   public void calculatePay(){
        getAverageMonthlySalary();
   }

    @Override
    public String toString() {
        System.out.println("To String Salaried Pay" + averageMonthlySalary);
        return this.getName() + " " + averageMonthlySalary+"0";
        // TODO fill in code here and replace the return statement, be sure to format double value
    }

    // TODO fill in code here
}
