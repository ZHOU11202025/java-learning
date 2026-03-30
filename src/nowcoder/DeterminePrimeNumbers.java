package nowcoder;

import java.util.Scanner;
//判断输入的数是否为质数
public class DeterminePrimeNumbers {
    public static void main(String[] args) {
        DeterminePrimeNumbers main = new DeterminePrimeNumbers();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(main.isPrimeNumber(number));
    }

    public Boolean isPrimeNumber(int number) {

        //write your code here......
        if(number <= 1){
            return false;
        }
        else if(number == 2 || number == 3){
            return true;
        }
        else if(number % 2 == 0){
            return false;
        }
        else{
            for(int i = 3;i < number;i += 2){
                if(number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}