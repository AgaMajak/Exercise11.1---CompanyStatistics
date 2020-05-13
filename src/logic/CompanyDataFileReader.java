package logic;

import Data.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompanyDataFileReader {
    private static String FILE_NAME = "CompanyData.txt";
    private static File FILE = new File(FILE_NAME);


    public static void readEmployeeFile(Employee[] employees) throws FileNotFoundException {
        int i = 0;
        Scanner scan = new Scanner(FILE);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] employeeElements = line.split(";");
            int parse = Integer.parseInt(employeeElements[4]);
            employees[i] = new Employee(employeeElements[0], employeeElements[1], employeeElements[2], employeeElements[3], parse);
            i++;
        }
        scan.close();
    }
}
