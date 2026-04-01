package nowcoder;

import java.util.Scanner;
//输入一个整数，计算它的位数。如果输入的整数不大于0则输出这个数
public class LengthOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        //write code here......
        int count = 1;
        if(num <= 0){
            System.out.println(num);
        }
        else{
            while(num / 10 != 0){
                num /= 10;
                count++;
            }
            System.out.println(count);
        }
    }
}