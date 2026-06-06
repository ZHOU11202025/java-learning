package practice;

import java.util.Scanner;

//输入商品名称和商品价格，要求打印效果示例，使用前面学习的方法完成:商品名 商品价格  手机  123,564.59
//要求:价格的小数点前面每三位用逗号隔开，在输出。
public class PriceFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品：");
        String s1 = sc.nextLine();
        System.out.println("请输入商品价格：");
        Double d1 = sc.nextDouble();
        String s2 = String.format("%.2f", d1);
        String[] split = s2.split("\\.");
        StringBuffer sb = new StringBuffer(split[0]);
        int len = sb.length();
        System.out.println("商品名\t" + "商品价格");
        for (int i = len - 3; i > 0; i -= 3) {
            sb.insert(i, ',');
        }
        sb = sb.append(".").append(split[1].toString());
        System.out.println(s1 + "\t" + sb);
        sc.close();
    }
}
