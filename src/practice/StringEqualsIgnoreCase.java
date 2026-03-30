package practice;
//输入两个字符串，判断是否相等（忽略大小写）
import java.util.Scanner;
public class StringEqualsIgnoreCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String a = sc.nextLine();
        System.out.println("请输入第二个字符串");
        String b = sc.nextLine();
        if( a.equalsIgnoreCase(b) ){
            System.out.println("相等");
        }
        else{
            System.out.println("不相等");

        }
        sc.close();
    }
}
