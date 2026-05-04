package practice;
//将对象作为参数传递给方法。
// 要求：1.定义一个Circle1类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积。
// 2.定义一个类PassObject，在类中定义一个方法printAreas()，
// 该方法的定义如下：public void printAreas(Circle c,int times)
// 3.在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
// 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积
// 4.在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
public class AreaTest {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        PassObject p =  new PassObject();
        p.printArea(c,5);
    }
}
class Circle1{
    double radius;
    public Circle1(){}
    public Circle1(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double setRadius(double radius){//大多时候类的属性不能直接调用，所以创建一个方法可以改变radius值
        this.radius = radius;
        return this.radius;
    }
}
class PassObject{
    public void printArea(Circle1 c,int times){
        System.out.printf("%-10s %-20s\n","Radius","Area");//左对齐，用printf，分别占10，20个字符宽度
        for(int i = 1;i <= times;i++){
            c.setRadius(i);
            System.out.printf("%-10s %-20s\n",c.setRadius(i),c.findArea());
        }
    }
}