package nowcoder;

import java.util.Scanner;
//在不使用第三个变量的情况下交换两个int类型变量的值,输入a变量和b变量的值，输出交换后a变量和b变量的值，中间用空格隔开
public class SwapVariableValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //write your code here.......
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a+" "+b);
    }
}