package practice;
//创建一个Cale计算类，在其中定义两个变量表示两个操作数，
// 定义四个方法实现求和，差，乘，商（要求除数为零的话，要提示）并创建两个对象，分别测试
public class Calculator {
    public static void main(String[] args){
        Cale c1 = new Cale(2,5);
        Cale c2 = new Cale(6,0);
        System.out.println(c1.num1 + " + " + c1.num2 + " = " + c1.sum());
        System.out.println(c2.num1 + " + " + c2.num2 + " = " + c2.sum());
        System.out.println(c1.num1 + " - " + c1.num2 + " = " + c1.difference());
        System.out.println(c2.num1 + " - " + c2.num2 + " = " + c2.difference());
        System.out.println(c1.num1 + " * " + c1.num2 + " = " + c1.product());
        System.out.println(c2.num1 + " * " + c2.num2 + " = " + c2.product());
        Double res1 = c1.quotient();
        if(res1 != null){
            System.out.println(c1.num1 + " / " + c1.num2 + " = " + c1.quotient());
        }
        else {
            System.out.println("除数不能为零");
        }
        Double res2 = c2.quotient();
        if(res2 != null){
            System.out.println(c2.num1 + " / " + c2.num2 + " = " + c2.quotient());
        }
        else {
            System.out.println("除数不能为零");
        }
    }
}
class Cale{
    double num1;
    double num2;
    public Cale(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return num1 + num2;
    }
    public double difference(){
        return num1 - num2;
    }
    public double product(){
        return num1 * num2;
    }
    public Double quotient(){
        if(num2 != 0){
            return num1 / num2;
        }
        return null;
    }
}