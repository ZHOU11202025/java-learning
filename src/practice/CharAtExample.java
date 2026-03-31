package practice;
//输入一个字符串，输出它的第三个字符（下标从0开始）
import java.util.Scanner;


public class CharAtExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        char c = s.charAt(2);
        System.out.println("输出它的第三个字符：" + c);
    }
}
