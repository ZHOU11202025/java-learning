package school;

public class SalarySystemTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John", 6);
        employees[1] = new SalariedEmployee("Jake", 7,8000);
        employees[2] = new HourlySalary("Mike", 8,50,240);
        employees[3] = new SalesEmployee("Lily", 10,10000
                ,0.05);
        employees[4] = new BasePlusSalesEmployee("Sara", 9,8000
                ,0.03,5000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSalary(6));
        }
    }
}
//所有员工的父类
class Employee{
    private String name;
    private int birthMonth;
    public Employee() {}
    public Employee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;
    }
    public String getName() {
        return name;
    }
    public int getBirthMonth() {
        return birthMonth;
    }
    public double getSalary(int month){
        return 0;
    }

}
//拿固定工资的员工
class SalariedEmployee extends Employee{
    private double monthSalary;
    public SalariedEmployee(String name, int birthMonth, double monthSalary) {
        super(name, birthMonth);
        this.monthSalary = monthSalary;
    }
    public double getMonthSalary() {
        return monthSalary;
    }
    public double getSalary(int month){
        if(month == getBirthMonth()){
            return monthSalary + 100;
        }
        else{
            return monthSalary;
        }
    }
}
//按小时拿工资的员工(每月工作超出160h的部分按照1.5倍工资发放)
class HourlySalary extends Employee{
    private double hourSalary;
    private int hour;//每个月工作小时数
    public HourlySalary(String name, int birthMonth, double hourSalary, int hour) {
        super(name, birthMonth);
        this.hour = hour;
        this.hourSalary = hourSalary;
    }
    public double getHourSalary() {
        return hourSalary;
    }
    public int getHour() {
        return hour;
    }
    public double getSalary(int month){
        if(hour > 160){
            if(month == getBirthMonth()){
                return hourSalary * 160 + 1.5 * hourSalary * (hour - 160) + 100;
            }
            else{
                return hourSalary * 160 + 1.5 * hourSalary * (hour - 160) ;
            }
        }
        else{
            if(month == getBirthMonth()){
                return hourSalary * hour + 100;
            }
            else{
                return hourSalary * hour ;
            }
        }

    }
}
//销售人员
class SalesEmployee extends Employee{
    private double monthSales;//月销售额
    private double commissionRate;
    public SalesEmployee(String name, int birthMonth, double monthSales, double commissionRate) {
        super(name, birthMonth);
        this.monthSales = monthSales;
        this.commissionRate = commissionRate;
    }
    public double getMonthSales() {
        return monthSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public double getSalary(int month){
        if(month == getBirthMonth()){
            return monthSales * commissionRate + 100;
        }
        else{
            return monthSales * commissionRate ;
        }
    }
}
//有固定底薪的销售人员（工资为底薪加上销售提成）
class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;
    public BasePlusSalesEmployee(String name, int birthMonth, double monthSales, double commissionRate, double baseSalary) {
        super(name, birthMonth, monthSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double getSalary(int month){
        return super.getSalary(month) + baseSalary;
    }
}