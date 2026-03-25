package nowcoder;
//输入两个正整数，再输出它们的和，差，积，商，模。每个值之间用空格隔开
import java.util.Scanner;

public class SimpleOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        //write your code here......
        if(a > b){
            System.out.println((a+b) + " " + (a-b) + " " + (a*b) + " " + (a/b) + " " + (a%b));
        }
        else{
            System.out.println((a+b) + " " + (b-a) + " " + (b*a) + " " + (b/a) + " " + (b%a));
        }

    }
}