package nowcoder;

import java.util.Scanner;
//将用户输入的六个数字填入数组并找出数组中最大值和最小值，输出数组中的最大值，最小值(最大值最小值之间用空格隔开。
public class ArrayLoop {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <ary.length ; i++) {
            ary[i]=scanner.nextInt();
        }

        //write your code here......
        max = ary[0];
        min = ary[0];
        for(int i = 1;i < ary.length;i++){
            if(ary[i] > max){
                max = ary[i];
            }
            if(ary[i] < min){
                min = ary[i];
            }
        }

        System.out.println(max+" "+min);
    }
}