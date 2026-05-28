package practice;
//编写一个Employee类，声明为抽象类，包含如下三个属性:name,id,salary。
// 提供必要的构造器和抽象方法:work()。对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
// 请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问，实现workO，
// 提示"经理/普通员工名字工作中...."
public class EmployeeWorkTest {
    public static void main(String[] args) {
        CommonEmployee employee1 = new CommonEmployee("Mike","001",8000);
        Manager1 employee2 = new Manager1("Lily","002",12000,3000);
        employee1.work();
        employee2.work();
    }
}
abstract class Employee1 {
    private String name;
    private String id;
    private double salary;
    public Employee1(){}
    public Employee1(String name,String id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public abstract void work();
    @Override
    public String toString() {
        return"name:" + this.getName() + " id:" + this.getId() + " salary:" + this.getSalary();
    }
}
class CommonEmployee extends Employee1 {
    public CommonEmployee(String name,String id,double salary){
        super(name,id,salary);
    }
    @Override
    public void work(){
        System.out.println(" 普通员工" + super.toString() + " 工作中...");
    }
}
class Manager1 extends Employee1 {
    private double bonus;
    public Manager1(String name,String id,double salary,double bonus){
        super(name,id,salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    @Override
    public void work(){
        System.out.println(" 经理" + super.toString() + " bonus:" + this.getBonus() + " 工作中...");
    }
}
