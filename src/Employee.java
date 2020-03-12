public class Employee implements CalculatePay {
    public String employeeId;
    public String name;
    public double averageMonthlySalary;


    public Employee(String employeeId, String name) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return this.getName() + " " + averageMonthlySalary + " ";
    }

    @Override
    public void calculatePay() {
    }
}
