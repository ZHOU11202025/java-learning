//编写一个“数字统计程序”：
//        1. 用户输入一个正整数 n；
//        2. 使用 for 循环或 while 循环输出从 1 到 n 中所有能被 7 整除的数，并统计这些
//        数的个数与总和；
import java.util.Scanner;
public class CountSumDivisibleBy7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        int sum = 0;
        for(int i = 1;i <= n;i++){
            if(i % 7 == 0){
                System.out.println("能被7整除的数为" + i);
                sum += i;
                num++;
            }
        }
        System.out.println("其中能被7整除的个数为" + num);
        System.out.println("其中能被7整除的数的总和为" + sum);

        scanner.close();
    }
}
