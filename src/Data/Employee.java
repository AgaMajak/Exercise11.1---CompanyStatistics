package Data;

public class Employee {
    private String firstName;
    private String lastName;
    private String pesel;
    private String departament;
    private int salary;

    public Employee(String firstName, String lastName, String pesel, String departament, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.departament = departament;
        this.salary = salary;
    }

    public String getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Data.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", departament='" + departament + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
