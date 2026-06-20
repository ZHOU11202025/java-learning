package practice;

import java.util.ArrayList;
import java.util.Comparator;

//定义Employee类
// 1) 该类包含:private成员变量name,sal,birthday,其中 birthday 为 MyDate 类的对象
// 2)为每一个属性定义getter,setter方法;
// 3)重写 toString 方法输出 name, sal, birthday
// 4) MyDate类包含:private成员变量month,day,year;并为每一个属性定义 getter,setter方法;
// 5)创建该类的3个对象，并把这些对象放入ArrayList 集合中(ArrayList 需使用泛型来定义)，对集合中的元素进行排序，并遍历输出:
//排序方式:调用ArrayList 的sort 方法，传入Comparator对象[使用泛型]，
// 先按照name排序，如果name相同，则按生日日期的先后排序。[即:定制排序
public class EmployeeSortTest {
    public static void main(String[] args) {
        ArrayList<Employee3> list = new ArrayList<>();
        list.add(new Employee3("jake",20000,new MyDate(10,20,2003)));
        list.add(new Employee3("jake",18000,new MyDate(6,2,2002)));
        list.add(new Employee3("amy",15000,new MyDate(12,14,2001)));
        list.sort(new Comparator<>() {
            @Override
            public int compare(Employee3 o1, Employee3 o2) {
                int nameCompare = o1.getName().compareTo(o2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                }
                else {
                    MyDate d1 = o1.getMyDate();
                    MyDate d2 = o2.getMyDate();
                    int yearCompare = Integer.compare(d1.getYear(),d2.getYear());
                    if (yearCompare != 0) {
                        return yearCompare;
                    }
                    else {
                        int monthCompare = Integer.compare(d1.getMonth(),d2.getMonth());
                        if (monthCompare != 0) {
                            return monthCompare;
                        }
                        else {
                            return Integer.compare(d1.getDay(),d2.getDay());
                        }
                    }
                }
            }
        });
        for (Employee3 employee3 : list) {
            System.out.println(employee3);
        }
    }
}

class Employee3 {
    private String name;
    private double sal;
    MyDate myDate;

    public Employee3(String name, double sal, MyDate myDate) {
        this.name = name;
        this.sal = sal;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "[ name :" + name + " sal :" + sal + " myDate :" + myDate + " ]";
    }
}

class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }
    @Override
    public String toString() {
        return "[month:" + this.month + ", day:" + this.day + ", year:" + this.year + "]";
    }
}