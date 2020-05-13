package Data.Departaments;

import Data.Employee;

public class IT extends Departament {


    @Override
    public int numbersOfDepartamentEmployes(Employee[] employees) {
        int employeeCounter = 0;

        for (Employee employee : employees) {

            if ("it".equals(employee.getDepartament())) {
                employeeCounter++;
            }
        }
        return employeeCounter;
    }


}
