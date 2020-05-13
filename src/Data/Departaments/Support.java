package Data.Departaments;

import Data.Employee;

public class Support extends Departament {


    @Override
    public int numbersOfDepartamentEmployes(Employee[] employees) {
        int employeeCounter = 0;

        for (Employee employee : employees) {

            if ("Data.Departaments.Support".equals(employee.getDepartament())) {
                employeeCounter++;
            }
        }
        return employeeCounter;
    }
}

