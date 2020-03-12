public class ContractedEmployee extends Employee{
  private String federalTaxId;
  public double hourlyRate;
  public double numberOfHoursWorked;
  public static double averageMonthlySalary;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId,name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return "" + federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  public double getAverageMonthlySalary() {
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

}
