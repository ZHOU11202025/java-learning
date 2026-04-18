package practice;
//有一个方法：判断一个数是奇数odd还是偶数even，返回boolean
import java.util.Scanner;
class checker {
    public boolean isOdd(int num){
        return num % 2 != 0;
    }
    public boolean isEven(int num){
        return num % 2 == 0;
    }
}
public class OddEvenChecker {
    public static void main(String[] args){
        checker c = new checker();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个需要判断奇偶的数：");
        int num = sc.nextInt();
        System.out.println(num + "是否为奇数： " + c.isOdd(num));
        System.out.println(num + "是否为偶数： " + c.isEven(num));

    }
}
