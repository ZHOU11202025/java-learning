package practice;
//判断两个Person对象的内容是否相等，如果两个Person对缘象的各个属性值都一
//样，则返回true，反之false。Person类属性已给
public class PersonEqualityChecker {
    public static void main(String[] args) {
        Person4 p1 = new Person4("jack",18,'m');
        Person4 p2 = new Person4("jack",18,'m');
        System.out.println(p1.equals(p2));
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
    //重写Object中的equals方法
    public boolean equals(Object obj){
        //如果比较的两个对象是同一个对象
        if(this == obj){//this指当前调用equals方法的那个Person对象，即p1，obj则是传入的p2
            return true;
        }
        //类型判断
        if(obj instanceof Person4){
            Person4 p = (Person4) obj;//向下转型
            return this.getName().equals(p.getName()) && this.getAge() == p.getAge()
                    && this.getGender() == p.getGender();
        }
        return false;
    }
}