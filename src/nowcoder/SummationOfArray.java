package nowcoder;

public class SummationOfArray {
    public static void main(String[] args) {
        //有数列为：9，99，999，...，9999999999。要求使用程序计算此数列的和，并在控制台输出结果。（请尝试使用循环的方式生成这个数列并同时在循环中求和）,将该数列的和直接输出
        //write your code here........
        long sum = 0;
        long num = 0;
        long i = 0;
        for(int n = 0;n < 10;n++){
            num = 9 + 10 * i;
            i = num;
            sum += num;
        }
        System.out.println(sum);
    }
}
