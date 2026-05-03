package practice;
//设计一个Dog类，有名字，颜色和年龄属性，定义输出方法show（）显示其信息。并创建对象，进行测试（提示：this.属性）
public class DogTest {
    public static void main(String[] args){
        Dog dog = new Dog("Mike","黄色",6);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println("小狗的名字：" + this.name + " 颜色：" + this.color + " 年龄：" + this.age);
    }
}