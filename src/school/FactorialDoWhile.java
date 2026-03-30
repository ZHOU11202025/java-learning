package school;

public class FactorialDoWhile {
    public static void main(String[] args){
        //使用do...while循环语句计算5的阶乘
        int i = 5;
        int factorial = 1;
        do{
            factorial *= i;
            i--;
        }while(i > 0);
        System.out.println("5! = " + factorial);
        //1递增到5
        int n = 1;
        int factorial1 = 1;
        do{
            factorial1 *= n;
            n++;
        }while(n <= 5);
        System.out.println("5! = " + factorial1);
    }
}
