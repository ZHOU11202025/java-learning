package practice;

public class ArrayMax {
    public static void main(String[] args){
        //找数组{78，92，85，64，99}的最大值
        int[] arr = {78, 92, 85, 64, 99};
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println("该数组的最大值为 " + max);
    }
}
