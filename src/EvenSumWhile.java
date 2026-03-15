public class EvenSumWhile {
    public static void main(String[] args){
        //用while循环计算1到100的偶数和
        int n = 1;
        int sum = 0;
        while(n <= 100){
            if(n % 2 == 0){
                sum += n;
            }
            n++;
        }
        System.out.println("1到100的偶数和为：" + sum);
    }
}
