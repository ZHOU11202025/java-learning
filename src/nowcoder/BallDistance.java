package nowcoder;

import java.util.Scanner;
//一球从h米高度自由落下，每次落地后反弹回原高度的一半再落下，求它在第n次落地时共经过了多少米？第n次反弹多高？输入小球的初始高度和落地的次数
public class BallDistance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h=scanner.nextFloat();//初始高度
        int n =scanner.nextInt();//反弹次数

        //write your code here......
        float sum = 0;//落地共经过距离
        if(n == 1){
            sum = h;
            h /= 2;
        }
        else{
            sum = h;
            for(int i = 0;i < n;i++){
                h /= 2;
                sum += 2 * h;
            }
            sum -= 2 * h;
        }

        //输出格式为：System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));

    }
}