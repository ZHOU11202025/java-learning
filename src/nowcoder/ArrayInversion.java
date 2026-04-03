package nowcoder;

import java.util.Arrays;
import java.util.Scanner;
//输入6个整数，先将其输出然后再将数组倒转，再次输出数组
public class ArrayInversion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //write your code here......
        int temp;
        for(int i = 0;i < arr.length / 2 ;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}