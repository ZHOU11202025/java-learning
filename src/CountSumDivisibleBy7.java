import java.util.Scanner;
public class CountSumDivisibleBy7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        int sum = 0;
        for(int i = 1;i <= n;i++){
            if(i % 7 == 0){
                System.out.println("能被7整除的数为" + i);
                sum += i;
                num++;
            }
        }
        System.out.println("其中能被7整除的个数为" + num);
        System.out.println("其中能被7整除的数的总和为" + sum);

        scanner.close();
    }
}
