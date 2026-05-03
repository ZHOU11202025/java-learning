package practice;
//定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
public class Circle {
    public static void main(String[] args){
        CircleFunction c = new CircleFunction(5);
        System.out.println("圆周长：" + c.circumference());
        System.out.println("圆面积：" + c.circleArea());

    }
}
class CircleFunction{
    double radius;
    public CircleFunction(double radius){
        this.radius = radius;
    }
    public double circumference(){
        return 2 * Math.PI * this.radius;
    }
    public double circleArea(){
        return Math.PI * this.radius * this.radius;
    }
}