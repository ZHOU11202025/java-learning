package practice;
import java.util.Scanner;
//请使用递归的方式求出斐波那契数1，1，2，3，5，8，13...给你一个整数n，求出它的值是多少
public class FibonacciRecursion {
    public static void main(String[] args){
        Test t = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数n：");
        int n = sc.nextInt();
        System.out.println("该整数的斐波那契数为：" + t.print(n));
        sc.close();
    }
}
class Test{
    public int print(int n){
        if(n > 2){
            return print(n - 1) + print(n - 2);
        }
        else{
            return 1;
        }
    }
}