package practice;
//在Method类，定义三个重载方法max()，
// 第一个方法：返回两个int值中的最大值，第二个方法：返回两个double值中的最大值，第三个方法：返回三个double值中的最大值，
// 并分别调用三个方法
public class MaxOverloadDemo {
    public static void main(String[] args){
        Method m = new Method();
        System.out.println(m.max(2,4));
        System.out.println(m.max(2.3,2.4));
        System.out.println(m.max(2.3,3.4,5.5));
    }
}
class Method{
    public int max(int a,int b){
        return a > b ? a : b;
    }
    public double max(double a,double b){
        return a > b ? a : b;
    }
    public double max(double a,double b,double c){
        double m;
        m = a > b ? a : b;
        return m > c ? m : c;

    }
}