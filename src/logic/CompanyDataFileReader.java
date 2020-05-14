package logic;

import Data.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompanyDataFileReader {
    private static String FILE_NAME = "CompanyData.txt";
    private static File FILE = new File(FILE_NAME);


    public static Employee[] readEmployeeFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(FILE);
        int i = 0;
        int lines = getLines();
        Employee[] employees = new Employee[lines];
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] employeeElements = line.split(";");
            String firstName = employeeElements[0];
            String lastName = employeeElements[1];
            String pesel = employeeElements [2];
            String departament = employeeElements[3];
            String salary = employeeElements[4];
            int parse = Integer.parseInt(salary);
            employees[i] = new Employee(firstName, lastName, pesel, departament, parse);
            i++;
        }
        scanner.close();
        return employees;
    }

    private static int getLines() throws FileNotFoundException {

        Scanner scan = new Scanner(FILE);
        int lines = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            lines++;
        }
        scan.close();
        return lines;
    }


}
