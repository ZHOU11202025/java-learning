package practice;
//请编写一个程序，能够计算圆形的面积。要求圆周率为3.14.赋值的位置3个方式都写一下.
public class CircleAreaDemo {
    public static void main(String[] args) {
        CircleArea1 circleArea1 = new CircleArea1(10);
        CircleArea2 circleArea2 = new CircleArea2(10,3.14);
        CircleArea3 circleArea3 = new CircleArea3(10);
        System.out.println(circleArea1.getArea());
        System.out.println(circleArea2.getArea());
        System.out.println(circleArea3.getArea());
    }
}
//初始化定义
class CircleArea1{
    private double radius;
    private final  double PI = 3.14;
    public CircleArea1(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
}
//构造器内定义
class CircleArea2{
    private double radius;
    private final double PI;
    public CircleArea2(double radius,double pi) {
        this.radius = radius;
        this.PI = pi;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
}
//代码块内定义
class CircleArea3{
    private double radius;
    private final double PI;
    {
        PI = 3.14;
    }
    public CircleArea3(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
}