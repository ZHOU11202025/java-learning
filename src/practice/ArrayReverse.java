package practice;

public class ArrayReverse {
    public static void main(String[] args){
        //将数组{1，2，3，4，5}反转成{5，4，3，2，1}并打印
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i < arr1.length;i++){
            arr2[arr1.length - 1 - i] = arr1[i];
        }
        for(int j = 0;j < arr1.length;j++){
            System.out.print(arr2[j]+" ");
        }
    }
}
