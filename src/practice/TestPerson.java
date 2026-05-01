package practice;
//定义Person2类，里面有name，age属性，并提供compareTo比较方法，用于判断是否与另一个人相等，
//提供测试类TestPerson用于测试，名字和年龄完全一致，就返回true，否则返回false
public class TestPerson {
    public static void main(String[] args){
        Person2 p1 = new Person2("Mike",18);
        Person2 p2 = new Person2("Mary",18);
        System.out.println(p1.compareTo(p2));
    }
}
class Person2{
    String name;
    int age;
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person2 p){
        return this.name.equals(p.name) && this.age == p.age;
    }
}