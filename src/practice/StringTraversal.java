package practice;
import java.util.Scanner;
//键盘录入一个字符串，统计该字符串中出现大写字母，小写字母，数字的次数，不考虑其他类型字符
public class StringTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }
            else if(c >= 'a' && c <= 'z'){
                smallCount++;
            }
            else if(c >= '0' && c <= '9'){
                numberCount++;
            }
        }
        System.out.println("该字符串中大写字母个数为：" + bigCount);
        System.out.println("该字符串中小写字母个数为：" + smallCount);
        System.out.println("该字符串中数字个数为：" + numberCount);

    }
}
