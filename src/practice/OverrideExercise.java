package practice;
// 1.编写一个Person3类，包括属性/private(name、age),构造器、方法say(返回自我介绍的字符串)
//2.编写一个Student类，继承Person3类，增加id、score属性/private,以及构造器，定义say方法(返回自我介绍的信息).
//3.在main中分别创建Person和Student对象，调用say方法输出自我介绍。
public class OverrideExercise {
    public static void main(String[] args) {
        Person3 person = new Person3("jack",18);
        Student student = new Student("mike",20,"001",100);
        System.out.println(person.say());
        System.out.println(student.say());

    }
}
class Person3{
    private String name;
    private int age;
    public Person3(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String say(){
        return "姓名：" + this.name + " 年龄：" + this.age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
class Student extends Person3{
    private String id;
    private double score;
    public Student(String name, int age, String id,double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public String say(){
        return super.say() + " 学号：" + this.id +
                " 分数:" + this.score;

    }
}