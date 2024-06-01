package non_static_nested_class;

public class Employee {
    String empName;
    int empID;

    Employee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    private class Details {
        int empPin;
        String empSalary;

        Details(int empPin, String empSalary) {
            this.empPin = empPin;
            this.empSalary = empSalary;
        }

        void getDetails() {
            System.out.println("Employee Name: " + empName);
            System.out.print("Employee ID: " + empID);

        System.out.println("Employee Pin " + empPin);
          System.out.println("Employee Salary " + empSalary);

        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Sam Larry", 101);
        Employee.Details details = employee.new Details(45901, "$5000");

        details.getDetails();
    }


}
