package Data.Departaments;

import Data.Employee;

public class Management extends Departament {


    @Override
    public int numbersOfDepartamentEmployes(Employee[] employees) {
        int employeeCounter = 0;

        for (Employee employee : employees) {

            if ("Data.Departaments.Management".equals(employee.getDepartament())) {
                employeeCounter++;
            }
        }
        return employeeCounter;
    }
}

