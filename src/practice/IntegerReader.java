package practice;

import java.util.Scanner;

//如果用户输入的不是一个整数，就提示他反复输入，知道输入一个整数为止，用try-catch
public class IntegerReader {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        while(true){
            try {
                System.out.print("Enter a number: ");
                num = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
        System.out.printf("The number is: %d", num);
    }
}
