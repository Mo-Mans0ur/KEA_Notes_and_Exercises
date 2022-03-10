package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class Employee {
    public String firstName;
    public String lastName;
    public double monthlySalary;


    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

    public static void main(String[] args) {
        Employee susan = new Employee("susan", "jensen", 2340);
        System.out.println(susan);
        Employee timothy = new Employee("timothy", "andreasen", 5500);
        System.out.println(timothy);

        System.out.println(susan.monthlySalary * 1.1);
        System.out.println(timothy.monthlySalary * 1.1);
    }

    public double getMonthlySalary() {
        double bonus = monthlySalary * 1.1;
        return bonus;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
