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