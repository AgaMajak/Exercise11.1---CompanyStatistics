import Data.Employee;
import Data.Departament;
import logic.CompanyDataFileReader;
import logic.CompanyInfoWriter;

import java.io.*;

public class CompanyTest {
    public static void main(String[] args) throws FileNotFoundException {
        Employee[] employees = CompanyDataFileReader.readEmployeeFile();
        Departament departament = new Departament();
        departament.numbersOfDepartamentEmployes(employees);

        CompanyInfoWriter.writeCompanyInfo(employees,departament);
    }
}
