public class ArraySum {
    public static void main(String[] args){
        //计算数组{2，4，6，8，10}的和
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println("该数组的和为 " + sum);
    }
}
