package school;
//使用二维数组存放3x3的整数矩阵，分别输出该矩阵的主对角线元素和副对角线元素，并计算它们的和
import java.util.Scanner;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int sum1 = 0;
        int sum2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入3x3整数矩阵");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("主对角线元素：");
        for(int i = 0;i < 3;i++){
            System.out.print(arr[i][i]+" ");
            sum1 += arr[i][i];
        }
        System.out.println();
        System.out.println("主对角线元素的和为：");
        System.out.println(sum1);

        System.out.println("副对角线元素：");
        for(int i = 0;i < 3;i++){
            System.out.print(arr[i][3-i-1]+" ");
            sum2 += arr[i][3-i-1];
        }
        System.out.println();
        System.out.println("副对角线元素的和为：");
        System.out.println(sum2);
        scanner.close();

    }
}