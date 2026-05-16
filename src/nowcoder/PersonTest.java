package nowcoder;

import java.util.Scanner;

//采用封装的思想，为Person类定义年龄属性，要求：
//修改年龄时判断其范围，若年龄小于0则按0输出，若年龄大于200则按200输出。
public class PersonTest {

    public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }

}

class Person {

    private int age;

    //write your code here......
    public Person() {
    }

    public Person(int age) {
        setAge(age);
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else if (age > 200) {
            this.age = 200;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}