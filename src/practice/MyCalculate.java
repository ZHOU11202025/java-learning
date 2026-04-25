package practice;
//用重载方法计算两个整数，一个整数一个double，一个double一个整数，三个整数的和
public class MyCalculate {
    public static void main(String[] args){
        Calculate c = new Calculate();
        System.out.println(c.add(1 ,2));
    }
}
class Calculate{
    public int add(int a,int b){
        System.out.println("add(int a,int b)被调用");
        return a + b;
    }
    public double add(int a,double b){
        System.out.println("add(int a,double b)被调用");
        return a + b;
    }
    public double add(double a,int b){
        System.out.println("add(double a,int b)被调用");
        return a + b;
    }
    public int add(int a,int b,int c){
        System.out.println("add(int a,int b,int c)被调用");
        return a + b + c;
    }
}