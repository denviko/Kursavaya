package Kursovaya;



public class Employee {

    // Private field's
    private static int idGenerator = 0;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private float salary;
    private int Id;


    // Constructor
    public Employee(String firstName,String middleName,String lastName, int department, float salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.idGenerator++;
    }

    // Getter's
    public String getFirstName() {return firstName;
    }
    public String getMiddleName() {return middleName;
    }
    public String getLastName() {return lastName;
    }
    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return Id;
    }


    public String toString() {
        return this.firstName + this.middleName + this.lastName + " отдел " + this.department + " зарплата " + this.salary;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}






