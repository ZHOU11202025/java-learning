package nowcoder;

import java.util.*;
//编写一个方法，该方法的返回值是两个不大于100的正整数的最小公倍数
public class getLCM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
    }

    public static int getCM(int m, int n){

        //write your code here......
        int max = m;
        if(m < n){
            max = n;
        }
        while(true){
            if(max % m == 0 && max % n == 0){
                return max;
            }
            max++;
        }
    }
}