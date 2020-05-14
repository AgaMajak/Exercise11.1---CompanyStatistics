package logic;

import Data.Departament;
import Data.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CompanyInfoWriter {
    private static String FILE_NAME = "CompanyEmployeeInfo.txt";
    private static File FILE = new File(FILE_NAME);

    public static void writeCompanyInfo(Employee[] employees, Departament departament) {
        FileCreator.createFile(FILE);
        try (
                FileWriter fileWriter = new FileWriter(FILE_NAME);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            writer.write("Średnia wypłata: " + EmployeeInformation.averageSalary(employees));
            writer.newLine();
            writer.write("Najmniejsza wypłata: " + EmployeeInformation.smallestSalary(employees));
            writer.newLine();
            writer.write("Największa wypłata: " + EmployeeInformation.bigestSalary(employees));
            writer.newLine();
            writer.write("Liczba pracowników: " + EmployeeInformation.numberOfEmployees(employees));
            writer.newLine();
            writer.write("Liczba pracowników w dziale IT: " + departament.getItEmployeesNumber());
            writer.newLine();
            writer.write("Liczba pracowników w dziale Support: " + departament.getSupportEmployeesNumber());
            writer.newLine();
            writer.write("Liczba pracowników w dziale Management: " + departament.getManagamentEmployeesNumber());
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + FILE_NAME);
        }
    }

}
