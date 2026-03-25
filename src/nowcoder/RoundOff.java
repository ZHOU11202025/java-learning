package nowcoder;
//用户随机输入的浮点数,定义一个int类型变量i,i为由浮点数变量d四舍五入后的整数类型，请将转换后的i进行输出
import java.util.Scanner;
public class RoundOff{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int i;
        if((num - (int)num) >= 0.5){
            i = (int)num + 1;
            System.out.println(i);
        }
        else{
            i = (int)num;
            System.out.println(i);
        }
    }
}
