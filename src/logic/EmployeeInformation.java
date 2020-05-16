package logic;

import Data.Employee;

public class EmployeeInformation {

    public static int bigestSalary(Employee[] employees) {
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;

    }

    public static int smallestSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static int averageSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary / employees.length;
    }

    public static int numberOfEmployees(Employee[] employees) {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numberOfEmployees++;
            }
        }
        return numberOfEmployees;

    }
}


