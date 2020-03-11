public class Employee implements CalculatePay {
    // TODO fix class declaration and declare variables here
    public String employeeId;
    public String name;
    public double averageMonthlySalary;


    public Employee(String employeeId, String name) {
        this.name = name;
        this.employeeId = employeeId;// TODO fill in code here
    }

    public String getEmployeeId() {
        // TODO fill in code here and replace the return statement
        return "";
    }

    public void setEmployeeId(String employeeId) {
        // TODO fill in code here
    }

    public String getName() {
        return name;
        // TODO fill in code here and replace the return statement
    }

    public void setName(String name) {
        this.name = name;
        // TODO fill in code here
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return this.getName() + " " + averageMonthlySalary + " ";
        // TODO fill in code here and replace the return statement, be sure to format double value
    }

    @Override
    public void calculatePay() {
    }
}
