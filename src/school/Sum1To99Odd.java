package school;

public class Sum1To99Odd {
    public static void main(String[] args){
        //计算1+3+5+9+...+99的值
        int i = 1;
        int sum = 0;
        while(i < 100){
            if(i % 2 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println("1+3+5+9+...+99 = " + sum);
    }
}
