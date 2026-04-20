package practice;
import java.util.Scanner;
//根据行，列，字符打印 对应行数和列数的字符，比如 行：4，列：4，字符：#，则打印相应的效果
class Rectangle{
    public void Printer(int h , int l ,String c){
        for(int i = 0;i < h;i++){
            for(int j = 0;j < l;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

public class RectanglePrinter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入行数：");
        int h = sc.nextInt();
        System.out.printf("请输入列数：");
        int l = sc.nextInt();
        System.out.printf("请输入字符：");
        String c = sc.next();
        Rectangle r = new Rectangle();
        r.Printer(h ,l ,c);
        sc.close();
    }
}
