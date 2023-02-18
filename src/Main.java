import Kursovaya.Employee;



public class Main {

    public static void main(String[] args) {


        Employee CherepanovDD = new Employee("Черепанов Давид Даниилович", 1, 35700);
        System.out.println("CherepanovDD, отдел = " + CherepanovDD.getDepartment());
        System.out.println(CherepanovDD);
        System.out.println("CherepanovDD, зарплата " + CherepanovDD.getSalary());
        System.out.println("CherepanovDD = ФИО " + CherepanovDD.getEmployeeFullName());
        CherepanovDD.setDepartment(2);
        System.out.println("CherepanovDD отдел " + CherepanovDD.getDepartment());
        CherepanovDD.setSalary(35800);
        System.out.println("CherepanovDD зарплата " + CherepanovDD.getSalary());
        System.out.println("CherepanovDD Id " + CherepanovDD.getId());


        Employee OkulovIR = new Employee("Окулов Игорь Романович", 2, 35800);
        System.out.println("OkulovIR, отдел = " + OkulovIR.getDepartment());
        System.out.println(OkulovIR);
        System.out.println("OkulovIR, зарплата " + OkulovIR.getSalary());
        System.out.println("OkulovIR = ФИО " + OkulovIR.getEmployeeFullName());
        CherepanovDD.setDepartment(2);
        System.out.println("OkulovIR отдел " + OkulovIR.getDepartment());
        CherepanovDD.setSalary(35800);
        System.out.println("OkulovIR зарплата " + OkulovIR.getSalary());
        System.out.println("OkulovIR Id " + OkulovIR.getId());


        //Task 7
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Черепанов Давид Даниилович", 1, 35700);
        employees[1] = new Employee("Окулов Игорь Романович", 2, 35800);
        //A
        System.out.println("A");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        //B
        System.out.println("B");
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println(sum);
        //E
        System.out.println(sum / 2);

        //C
        System.out.println("C");
        float minSalary = Long.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println(minSalary);
        //D
        System.out.println("D");
        float maxSalary = -1;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println(maxSalary);
        //F
        System.out.println("F");
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeFullName());
        }

         //Advanced level
         //1
        System.out.println("1");
        for (Employee employee : employees) {
            System.out.println (employee.getSalary());


        }




    }
}