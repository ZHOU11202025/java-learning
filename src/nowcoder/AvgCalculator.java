package nowcoder;

import java.util.Scanner;
//键盘输入任意多个10000以内正整数（负数代表结束），求出它们的平均数，它们的平均数（平均数为double类型，保留两位小数）
public class AvgCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //write your code here......
        int num;
        double avg = 0;
        int count = 0;
        double sum = 0;
        while(true){
            num = scan.nextInt();
            if(num < 0){
                break;
            }
            sum += num;
            count++;
        }
        avg = sum / count;

        //输出格式为：System.out.println(String.format("%.2f",avg));
        System.out.println(String.format("%.2f",avg));

    }
}