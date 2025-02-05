abstract class Employee {
    abstract void calculateSalary();
    abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    private String name;
    private double monthlySalary;
    
    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.monthlySalary = salary;
    }
    
    @Override
    void calculateSalary() {
        System.out.println("Salary of Full-Time Employee " + name + ": " + monthlySalary);
    }
    
    @Override
    void displayDetails() {
        System.out.println("Full-Time Employee: " + name + ", Monthly Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    
    public PartTimeEmployee(String name, double rate, int hours) {
        this.name = name;
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }
    
    @Override
    void calculateSalary() {
        System.out.println("Salary of Part-Time Employee " + name + ": " + (hourlyRate * hoursWorked));
    }
    
    @Override
    void displayDetails() {
        System.out.println("Part-Time Employee: " + name + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Alice", 5000);
        employees[1] = new PartTimeEmployee("Bob", 20, 120);
        
        for (Employee emp : employees) {
            emp.displayDetails();
            emp.calculateSalary();
            System.out.println("-------------------------");
        }
    }
}