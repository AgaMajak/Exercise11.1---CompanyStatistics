import Data.Employee;
import Data.Departaments.Departament;
import Data.Departaments.IT;
import Data.Departaments.Management;
import Data.Departaments.Support;
import logic.CompanyDataFileReader;
import logic.FileCreator;
import logic.EmployeeInformation;

import java.io.*;

public class CompanyTest {
    public static void main(String[] args) throws FileNotFoundException {
        Employee[] employees = new Employee[4];
        CompanyDataFileReader.readEmployeeFile(employees);

        Departament[] departaments = {
                new IT(),
                new Support(),
                new Management()
        };

        String fileName = "CompanyEmployeeInfo.txt";
        File file = new File(fileName);

        FileCreator.createFile(file);

        try (
                FileWriter fileWriter = new FileWriter(fileName);
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
            writer.write("Liczba pracowników w dziale IT: " + departaments[0].numbersOfDepartamentEmployes(employees));
            writer.newLine();
            writer.write("Liczba pracowników w dziale Support: " + departaments[1].numbersOfDepartamentEmployes(employees));
            writer.newLine();
            writer.write("Liczba pracowników w dziale Management: " + departaments[2].numbersOfDepartamentEmployes(employees));
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }
}
