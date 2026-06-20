package practice;

import java.util.HashMap;
import java.util.Map;

//1.创建3个学生对象2.放入到 HashMap中，要求Key 是 String name, Value就是 学生对象3.使用两种方式遍历
public class StudentMapDemo {
    public static void main(String[] args) {
        Map<String, Student_> map = new HashMap<>();
        map.put("jake",new Student_("jake",20));
        map.put("jim",new Student_("jim",24));
        map.put("sara",new Student_("sara",18));
        for (String s : map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }
        for (Map.Entry<String,Student_> mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
        }
    }
}
class Student_{
    private String name;
    private int age;
    public Student_(String name,int age) {
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
        return "[name=" + name + ", age=" + age + "]";
    }
}