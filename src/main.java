import Kursovaya.Employee;

import java.util.Random;


public class main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        fill();
        printAllemployees();
        sumSalary();
        findeAverageSalary();
        findMaxSalary();
        findMinSalary();
        printFullName();

    }

    public static void fill() {
        Random r = new Random();
        employees[0] = new Employee("Давид ", " Даниилович ", "Черепанов", 1, 35700);
        employees[1] = new Employee("Игорь ", " Романович ", " Окулов ", 2, 35800);
        employees[2] = new Employee("Федор ", " Дамирович ", " Гончаров ", 3, 35850);
        employees[3] = new Employee("Владислав ", " Викторович ", " Федосеев ", 4, 36000);
        employees[4] = new Employee("Степан ", " Федорович ", " Макаров ", 5, 36500);
        employees[5] = new Employee("Вера ", " Артемовна ", " Козлова ", 1, 37000);
        employees[6] = new Employee("Вероника ", " Назаровна ", " Туманова ", 2, 37500);
        employees[7] = new Employee("Маргарита ", " Руслановна ", "Константинова", 3, 38000);
        employees[8] = new Employee("Елизавета ", " Богдановна ", " Кузнецова ", 4, 38500);
        employees[9] = new Employee("Илья ", " Максимович ", "Шульгин  ", 5, 39000);
    }


    private static void printAllemployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static float sumSalary() {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма зарплат составляет " + sum);
        return sum;
    }
    private static float findMinSalary() {
         float minSalary = Long.MAX_VALUE;
           for (Employee employee : employees) {
             if (employee.getSalary() < minSalary) {
                 minSalary = employee.getSalary();
             }
         }
         System.out.println("Минимальная зарплата составляет " + minSalary);
        return minSalary;
    }

     private static float findMaxSalary() {
         float maxSalary = -1;
         for (Employee employee : employees) {
             if (employee.getSalary() > maxSalary) {
                 maxSalary = employee.getSalary();
             }
         }
         System.out.println("Максимальная зарплата составляет " + maxSalary);
       return maxSalary;
     }
     private static void findeAverageSalary() {
        var sum = sumSalary();
        var average = sum / employees.length;
        System.out.println("Средняя зарплата " + average);
    }


     private static void printFullName() {
         for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + "  "  + employee.getMiddleName() + " " + employee.getLastName() + " ");
}
}
}


