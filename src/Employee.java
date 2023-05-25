public class Employee extends Worker {
    private long  employeeId;
    private String hireDate;

    private static int EmployeeNo = 1;

    public Employee() {
    }

    public Employee(String name, String birthDate,  String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.EmployeeNo++;
        this.hireDate = hireDate;
    }

    public Employee(long employeeId, String hireDate) {
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}' + super.toString();
    }
}
