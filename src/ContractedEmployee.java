public class ContractedEmployee extends Employee{
  private String federalTaxId;
  public double hourlyRate;
  public double numberOfHoursWorked;
  public static double averageMonthlySalary;
  // TODO fix class declaration and declare variables here

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId,name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    // TODO fill in code here and replace the return statement
    return "" + federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    // TODO fill in code here
  }

  public double getHourlyRate() {
    // TODO fill in code here and replace the return statement
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
    // TODO fill in code here
  }

  public double getNumberOfHoursWorked() {
    // TODO fill in code here and replace the return statement
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
    // TODO fill in code here
  }

  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement
    return this.averageMonthlySalary;
  }

  public void calculatePay(){
    this.averageMonthlySalary = hourlyRate * numberOfHoursWorked;
  }

  @Override
  public String toString() {
     this.getAverageMonthlySalary();
    return getName() + " " + Math.ceil(averageMonthlySalary)+"0";
  }

  // TODO fill in code here
}
