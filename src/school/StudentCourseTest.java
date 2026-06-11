package school;

//定义一个Course类，包含私有属性:课程编号(id)、课程名称(name)、学分(credit)。
//-定义一个Student类，包含私有属性:学号(id)、姓名(name),以及一个Course[]用于保存所选课程。
//-在Student类中提供方法:
//addCourse(Course c):添加课程
//deleteCourse(Course c):删除课程
// showCourses (:显示该学生的所有课程信息
//-在主方法中，创建若干个课程和学生对象，模拟学生选课、退课并展示课程列表。
public class StudentCourseTest {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        Course java = new Course(1, "java", 3);
        Course python = new Course(2, "python", 2);
        Course c = new Course(3, "c", 1);
        students[0] = new Student(1001, "张三");
        students[1] = new Student(1002, "李四");
        students[1].addCourse(java);
        students[1].addCourse(python);
        students[1].deleteCourse(java);
        students[1].showCourse();
    }
}

class Course {
    private int id;
    private String name;
    private int credit;

    public Course(int id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getCredit() {
        return this.credit;
    }

    @Override
    public String toString() {
        return "[课程编号： " + this.id + "\t" + "课程名称： " + this.name + "\t" + "学分：" + this.credit + "]";
    }
}

class Student {
    private int id;
    private String name;
    private Course[] course = new Course[3];
    private int count;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    public void addCourse(Course c) {
        course[count] = c;
        count++;
        System.out.println("添加成功");
    }

    public void deleteCourse(Course c) {
        int index = -1;
        for (int i = 0; i < course.length; i++) {
            if (course[i].getId() == c.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = 0; i < count - 1; i++) {
                course[i] = course[i + 1];
            }
            course[count - 1] = null;
            count--;
            System.out.println("删除成功");
        } else {
            System.out.println("未找到匹配课程");
        }
    }

    public void showCourse() {
        System.out.println("学生" + name + "的课程情况是：");
        for (int i = 0; i < count; i++) {
            System.out.println(course[i]);
        }
    }
}