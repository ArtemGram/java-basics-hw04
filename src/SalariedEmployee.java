public class SalariedEmployee extends Employee {
    public double fixedMonthlyPayment;
    public String socialSecurityNumber;
    public static double averageMonthlySalary;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public double getAverageMonthlySalary() {
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
    }

}
