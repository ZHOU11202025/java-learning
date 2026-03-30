package practice;

public class DivisibleBy3Sum {
    public static void main(String[] args){
        //计算1到100中所有能被3整除的数的和（用while循环）
        int i = 1;
        int sum = 0;
        while(i <= 100){
            if(i % 3 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("1到100中所有能被3整除的数的和为 " + sum);
    }
}
