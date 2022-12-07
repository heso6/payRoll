import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee JanKowal = new Employee("Jan", "Kowal", 3100);
        Employee AnnaArbuz = new Employee("Anna", "Arbuz", 3700);
        Employee IlonaMaluch = new Employee("Ilona", "Maluch", 2500);
        Employee DanutaGitara = new Employee("Danuta", "Gitara", 5500);
        Employee AndrzejWiosna = new Employee("Andrzej", "Wiosna", 4500);

        Company company = new Company(new ArrayList<>());
        company.addEmployee(JanKowal);
        company.addEmployee(AnnaArbuz);
        company.addEmployee(IlonaMaluch);
        company.addEmployee(DanutaGitara);
        company.addEmployee(AndrzejWiosna);

        company.printEmployees();
        System.out.println("Suma wszystkich wypłat: " + company.getSum() + "\n" + "Średnia wypłat wynosi: " + company.getAvr());
    }
}

