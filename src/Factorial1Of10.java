public class Factorial1Of10 {
    public static void main(String[] args){
        //用do while循环计算10！
        int ret = 1;
        int i = 1;
        do{
            ret *= i;
            i++;
        }while(i <= 10);
        System.out.println("10! = "+ ret );
    }
}
