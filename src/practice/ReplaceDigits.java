package practice;
//输入一个字符串，将其中的所有数字替换为*
import java.util.Scanner;
public class ReplaceDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                s = s.replace(c,'*');
            }
        }
        System.out.println(s);
    }
}