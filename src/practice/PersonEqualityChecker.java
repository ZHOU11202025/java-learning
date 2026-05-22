package practice;
//判断两个Person对象的内容是否相等，如果两个Person对缘象的各个属性值都一
//样，则返回true，反之false。Person类属性已给
public class PersonEqualityChecker {
    public static void main(String[] args) {
        Person4 p1 = new Person4("jack",18,'m');
        Person4 p2 = new Person4("mike",22,'m');
        System.out.println(p1.equalityCheck(p1,p2));
    }
}
class Person4{
    private String name;
    private int age;
    private char gender;
    public Person4(){}
    public Person4(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public boolean equalityCheck(Person4 p1,Person4 p2){
        return p1.getName().equals(p2.getName()) && p1.getAge() == p2.getAge() && p1.getGender() == p2.getGender();
    }
}