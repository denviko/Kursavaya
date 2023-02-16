import Kursovaya.Employee;

import java.util.Arrays;


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

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Черепанов Давид Даниилович", 1, 35700);
        employees[1] = new Employee("Окулов Игорь Романович", 2, 35800);



        for (Employee e : employees) {
            System.out.println(e);


        }

    }
}