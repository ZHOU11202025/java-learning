package practice;
//定义方法max，实现求某double数组的最大值，并返回
public class ArrayMaxFinder {
    public static void main(String[] args){
        A01 a =  new A01();
        double[] arr = {2,4,5.6,1};
        Double res = a.max(arr);
        if(res != null){
            System.out.println("arr数组的最大值是：" + a.max(arr));
        }
        else{
            System.out.println("arr数组输入有误");
        }
    }
}
class A01{
    public Double max(double[] arr){//包装类Double可以保存double小数，也可以保存null
        if(arr != null && arr.length > 0){
            double max = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }
        else{
            return null;
        }
    }
}