package practice;
//编写一个方法copyPerson,可以复制一个Person对象，返回复制的对象。
// 克隆对象，注意要求得到的新对象和原来的对象是两个独立的对象，只是他们的属性相同
public class PersonCloner {
    public static void main(String[] args){
        Person p = new Person();
        p.name = "zhangsan";
        p.age = 20;
        Copy c = new Copy();
        Person p1 = c.copyPerson(p);
        System.out.println("p的name:"+ p.name + " p的age:" + p.age);
        System.out.println("p1的name:"+ p1.name + " p1的age:" + p1.age);
    }
}

class Person{
    String name;
    int age;
}

class Copy{
    public Person copyPerson(Person p) {
        Person p1 = new Person();
        p1.name = p.name;
        p1.age = p.age;
        return p1;
    }
}