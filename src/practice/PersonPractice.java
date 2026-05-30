package practice;

import java.util.Objects;

//· 创建一个 Person 类，有私有属性 String name 和 int age。
//· 提供构造方法、getter/setter。
//· 重写 equals 方法：当两个 Person 对象的 name 和 age 都相同时，返回 true。
//· 重写 hashCode 方法：使 equals 相等的对象 hashCode 也相等（可用 Objects.hash(name, age)）。
//· 重写 toString 方法：返回 "Person{name='xxx', age=xx}"。
//· 在 main 方法中创建至少三个对象，测试 equals 和 hashCode 的一致性，并打印。
public class PersonPractice {
    public static void main(String[] args) {
        Person_ p1 = new Person_("mike", 20);
        Person_ p2 = new Person_("mike", 20);
        Person_ p3 = new Person_("mike", 10);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("p3.hashCode() = " + p3.hashCode());
    }
}

class Person_ {
    private String name;
    private int age;

    public Person_() {
    }

    public Person_(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Person_ person = (Person_) obj;
        return this.name.equals(person.getName()) && this.age == person.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Person{name = '" + this.name + "', age = " + this.age + "}";
    }
}