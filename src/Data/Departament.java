package Data;

public class Departament {

    private int itEmployeesNumber;
    private int supportEmployeesNumber;
    private int managamentEmployeesNumber;

    public int getItEmployeesNumber() {
        return itEmployeesNumber;
    }

    public int getSupportEmployeesNumber() {
        return supportEmployeesNumber;
    }

    public int getManagamentEmployeesNumber() {
        return managamentEmployeesNumber;
    }

    public void numbersOfDepartamentEmployes(Employee[] employees) {
        for (Employee employee : employees) {
            if ("it".equals(employee.getDepartament())) {
                itEmployeesNumber++;
            } else if ("Support".equals(employee.getDepartament())) {
                supportEmployeesNumber++;
            } else if ("Management".equals(employee.getDepartament())) {
                managamentEmployeesNumber++;
            }
        }
    }



}
