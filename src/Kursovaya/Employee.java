package Kursovaya;



public class Employee {
    // Private field's
    private final String employeeFullName;
    private int department;
    private float salary;
    private static int Id;


    // Constructor
    public Employee(String employeeFullName, int department, float salary) {
        this.employeeFullName = employeeFullName;
        this.department = department;
        this.salary = salary;
        this.Id++;
    }

    // Getter's
    public String getEmployeeFullName() { return employeeFullName;}
    public int getDepartment() { return department;}
    public float getSalary() { return salary;}
    public int getId() {return Id;}


    public String toString(){
        return this.employeeFullName + " отдел " + this.department + " зарплата " + this.salary;}


    public void setDepartment (int department) {this.department = department;}
    public void setSalary (int salary) {this.salary = salary;}







}




