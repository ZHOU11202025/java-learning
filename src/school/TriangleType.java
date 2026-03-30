package school;//编写一个“三角形类型判断”程序：
//        1. 从键盘输入三条边长（整数）；
//        2. 判断是否能构成三角形：
//        - 若不能，输出“不能构成三角形”；
//        - 若能，进一步判断：
//        - 三边相等 → 等边三角形；
//        - 两边相等 → 等腰三角形；
//        - 满足勾股定理 → 直角三角形；
//        - 否则 → 一般三角形。
import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a + b > c && a + c > b && b + c > a){
            if(a / b == 1 && a / c == 1 && b / c == 1){
                System.out.println("等边三角形");
            }
            else if(a ==b || b == c || a == c){
                System.out.println("等腰三角形");
            }
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a){
                System.out.println("直角三角形");
            }
            else {
                System.out.println("一般三角形");
            }
        }
        else{
            System.out.println("不能构成三角形");
        }
        scanner.close();
    }
}