package practice;

import java.util.Scanner;
public class TwoDArrayPrint {
    public static void main(String[] args){
        //创建一个3x4的二维数组，用两层循环赋值并打印
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入3x4数组内的整数：");
        int[][] arr = new int[3][4];
        for(int i = 0;i < 3;i++){
            for(int j = 0;j< 4;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("由输入的数得出该二维数组为：");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j< 4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
