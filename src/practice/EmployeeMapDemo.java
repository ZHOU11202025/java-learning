package practice;

import java.util.*;

//使用HashMap添加3个员工对象，要求:
// 键:员工id    值:员工对象
//并遍历显示工资>18000的员工(遍历方式最少两种)员工类:姓名、工资、员工id
public class EmployeeMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, new Employee_("jack", 20000, 1));
        map.put(2, new Employee_("jim", 10000, 2));
        map.put(3, new Employee_("sara", 22000, 3));
        System.out.println("=====for循环遍历=====");
        for (Object o : map.keySet()) {
            Employee_ e = (Employee_) map.get(o);
            if (e.getSalary() > 18000) {
                System.out.println(o + "-" + map.get(o));
            }
        }
        System.out.println("=====迭代器遍历=====");
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Employee_ e1 = (Employee_) map.get(next);
            if (e1.getSalary() > 18000) {
                System.out.println(next + "-" + map.get(next));
            }
        }
    }
}

class Employee_ {
    private String name;
    private double salary;
    private int id;

    public Employee_() {
    }

    public Employee_(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{name=" + name + ", salary=" + salary + ", id=" + id + "}";
    }
}