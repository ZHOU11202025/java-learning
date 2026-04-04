package practice;
//字符串反转
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c;
        String result = "";
        for(int i = s.length() - 1;i >= 0;i--){
           c = s.charAt(i);
           result  = result + c;
        }
        System.out.println(result);
    }
}