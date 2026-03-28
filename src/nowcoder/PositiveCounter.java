package nowcoder;

import java.util.*;

public class PositiveCounter {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        //控制台输入整数，请设计一个死循环，当用户输入非正数时停止输入。请给出用户输入的正整数个数（默认输入个数不超过2147483647）
        //write your code here......
        while(true){
            int num = scanner.nextInt();
            if(num <= 0){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}