package practice;
import java.util.Scanner;
//用StringBuilder反转一个字符串
public class StringBuilderReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String result = sb.append(s).reverse().toString();
        System.out.println(result);
        sc.close();
    }
}
