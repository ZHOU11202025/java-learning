package practice;
//在前面定义的Person1类中添加两个构造器：第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
//第二个带 pName 和 pAge 两个参数的构造器：使得每次创建Person对象的同时初始化对象的age属性值和name属性值，
//分别使用不同的构造器，创建对象
public class PersonTest {
    public static void main(String[] args){
        Person1 p1 = new Person1();
        Person1 p2 = new Person1("张三",20);
        System.out.println("p1的信息 name:" + p1.name + " age:" + p1.age);
        System.out.println("p2的信息 name:" + p2.name + " age:" + p2.age);

    }
}
class Person1{
    String name;
    int age;
    public Person1(){
        age = 18;
    }
    public Person1(String pName, int pAge){
        name = pName;
        age = pAge;
    }
}