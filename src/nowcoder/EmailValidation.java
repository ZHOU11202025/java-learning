package nowcoder;

import java.util.Scanner;
//请根据给出的正则表达式来验证邮箱格式是否合法，如果用户输入的格式合法则输出「邮箱格式合法」，否则输出「邮箱格式不合法」。
public class EmailValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

        //write your code here......
        if(str.matches(emailMatcher)){
            System.out.println("邮箱格式合法");

        }
        else{
            System.out.println("邮箱格式不合法");

        }

    }
}
