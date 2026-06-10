package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//1.创建 3个Dog {name, age} 对象,放入到ArrayList中，赋给 List 引用
//2.用迭代器和增强for循环两种方式来遍历
//3.重写Dog 的toString方法,输出name和age
public class DogIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog_("jack",3));
        list.add(new Dog_("mike",2));
        list.add(new Dog_("lily",5));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }
        System.out.println("============================");
        for (Object obj:list) {
            System.out.println(obj.toString());
        }
    }
}
class Dog_{
    private String name;
    private int age;
    public Dog_(String name, int age) {
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
        return "name=" + name + ", age=" + age;
    }
}