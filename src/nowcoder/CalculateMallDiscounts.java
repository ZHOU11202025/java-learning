package nowcoder;

import java.util.*;
// //牛牛商场促销活动：
// 满100全额打9折；
// 满500全额打8折；
// 满2000全额打7折；
// 满5000全额打6折；
// 且商场有抹零活动，不足一元的部分不需要付款（类型强制转换）
public class CalculateMallDiscounts {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int price = console.nextInt();
        int cost = 0;

        //write your code here......
        if(price >= 5000){
            cost = (int)(price * 0.6);
        }
        else if(price >= 2000){
            cost = (int)(price * 0.7);
        }
        else if(price >= 500){
            cost = (int)(price * 0.8);
        }
        else if(price >= 100){
            cost = (int)(price * 0.9);
        }
        else{
            cost = (int)price;
        }

        System.out.println(cost);
    }
}