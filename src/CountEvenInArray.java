public class CountEvenInArray {
    public static void main(String[] args){
        //统计数组{1，2，3，4，5，6，7，8，9，10}中偶数的个数
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int i : arr){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("该数组中偶数个数为： " + count);
    }
}
