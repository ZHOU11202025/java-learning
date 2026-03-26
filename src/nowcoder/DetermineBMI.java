package nowcoder;

import java.util.Scanner;
//体重指数 = 体重 (kg) / ( 身高 (m) × 身高 (m) )，小于18.5属于偏瘦，介于18.5和20.9之间（左闭右开）属于苗条，介于20.9和24.9之间（左闭右闭）属于适中，超过24.9属于偏胖。下面由你来编写一段逻辑，算出输入了身高和体重的用户的体重指数，并返回他们的身材状态。(体重指数请使用double类型)
public class DetermineBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();

        //write your code here......
        double index = weight / (height * height) ;
        if(index < 18.5){
            System.out.println("偏瘦");
        }
        else if(index >= 18.5 && index < 20.9){
            System.out.println("苗条");
        }
        else if(index >= 20.9 && index < 24.9){
            System.out.println("适中");
        }
        else{
            System.out.println("偏胖");
        }
    }
}