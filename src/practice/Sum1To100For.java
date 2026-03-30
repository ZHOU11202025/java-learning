package practice;

public class Sum1To100For {
    public static void main(String[] args) {
        //计算1到100的和（用for循环）
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum += i;
        }
        System.out.println("1+2+3+...+100 = " + sum);
    }
}
