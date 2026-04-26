package practice;
//在类中定义三个重载方法并调用，三个方法分别接收一个int参数，两个int参数，一个字符串参数，
//分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息
public class MethodOverload {
    public static void main(String[] args) {
        Methods m =  new Methods();
        m.method(2);
        m.method(2,3);
        m.method("hello");

    }

}
class Methods{
    public void method(int a){
        System.out.println("执行平方运算：" + (a * a));
    }
    public void method(int a,int b){
        System.out.println("执行相乘运算：" + (a * b));
    }
    public void method(String a){
        System.out.println("输出字符串信息：" + a);
    }
}