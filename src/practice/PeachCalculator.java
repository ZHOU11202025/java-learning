package practice;
//猴子吃桃：有一堆桃子，猴子第一天吃了其中的一半，并在多吃了一个，以后的每一天都是如此，
// 当到了第十天，想再吃时发现只有一个桃子了，问最初有多少桃子
public class PeachCalculator {
    public static void main(String[] args){
        Peach p = new Peach();
        System.out.println("总共有：" + p.calculate(1) + "个桃子");
    }
}
class Peach{
    public int calculate(int n){

        if(n == 10){
            return 1;
        }
        else{
            return (calculate(n + 1) + 1) * 2;
        }
    }
}
