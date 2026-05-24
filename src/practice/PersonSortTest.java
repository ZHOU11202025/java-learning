package practice;

//定义-个Person类{name，age,job},初始化Person对象数组，有3个person对象，并
//按照age 从大到小进行排序，提示，使用冒泡排序
public class PersonSortTest {
    public static void main(String[] args) {
        Person5[] persons = new Person5[3];
        persons[0] = new Person5("jack", 20, "程序员");
        persons[1] = new Person5("mike", 26, "工程师");
        persons[2] = new Person5("lily", 30, "设计师");
        new Person5().ageSort(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}

class Person5 {
    private String name;
    private int age;
    private String job;

    public Person5() {
    }

    public Person5(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void ageSort(Person5[] people) {
        Person5 temp;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 1; j < people.length - i; j++) {
                if (people[j].getAge() > people[j - 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j - 1];
                    people[j - 1] = temp;
                }
            }
        }
    }

    public String toString() {
        return "name: " + name + ", age: " + age + ", job: " + job;
    }
}