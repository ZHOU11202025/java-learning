package practice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//定义一个Employee类，该类包含:private成员属性name,age 要求:
//1.创建3个Employee 放入 HashSet中
//2.当name和age的值相同时，认为是相同员工，不能添加到HashSet集合中
public class EmployeeSetTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Employee2  e1 = new Employee2("jack",20);
        Employee2  e2 = new Employee2("jack",20);
        Employee2  e3 = new Employee2("jim",30);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
class Employee2 {
    private String name;
    private int age;
    public Employee2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "{name=" + name + ", age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee2 employee2)) return false;
        return age == employee2.age && Objects.equals(name, employee2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}