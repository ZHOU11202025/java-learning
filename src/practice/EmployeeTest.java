package practice;

public class EmployeeTest {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("nick",6000);
        employees[1] = new Staff("jack",8000);
        employees[2] = new Manager("mike",18000,10000);
        for(int i = 0;i < employees.length;i++) {
            showEmpAnnual(employees[i]);
            workTest(employees[i]);
            System.out.println("======================");
        }

    }
    public static void showEmpAnnual(Employee e){
        System.out.println(e.getName() +" " + e.getAnnual());
    }
    public static void workTest(Employee e) {
        if(e instanceof Manager){
            ((Manager)e).manage();
        }
        else if(e instanceof Staff){
            ((Staff)e).work();
        }
    }
}

class Employee{
    private String name;
    private double salary;
    public Employee(){}
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public double getAnnual(){
        return 12 * salary;
    }
}
class Staff extends Employee{
    public Staff(String name,double salary){
        super(name,salary);
    }
    public void work(){
        System.out.println("正在工作");
    }
    public double getAnnual(){
        return 12 * super.getSalary();
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name,double salary,double bonus){
        super(name,salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public double getAnnual(){
        return 12 * super.getSalary() + this.bonus;
    }
    public void manage(){
        System.out.println("正在管理");
    }
}