package practice;
//定义方法max，实现求某double数组的最大值，并返回
public class ArrayMaxFinder {
    public static void main(String[] args){
        A01 a =  new A01();
        double[] arr = {2,4,5.5,7};
        System.out.println("arr数组的最大值是：" + a.max(arr));
    }
}
class A01{
    public double max(double[] arr){
        double max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}