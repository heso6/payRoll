import java.util.List;

public class Company {

    private List<Employee> listOfEmployees;

    public Company(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public List<Employee> getEmployeeList() {
        return listOfEmployees;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.listOfEmployees = employeeList;
    }

    public void addEmployee(Employee employee) {
        listOfEmployees.add(employee);
    }

    public void printEmployees() {
        for (Employee employee : listOfEmployees) {
//            employee.getAllData();
            System.out.println(employee.toString());
        }
    }

    public double getSum() {
        double sumOfAllSalary = 0;
        for (Employee employee : listOfEmployees) {
            sumOfAllSalary += employee.getSalary();
        }
        return sumOfAllSalary;
    }

    public double getAvr() {
        return getSum() / listOfEmployees.size();
    }
}

