package practice;
//实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
public class ArrayCopier {
    public static void main(String[] args){
        int[] arr = {2,4,3,5,7};
        A aa = new A(arr);
        int[] arrCopied = aa.copyArr();
        aa.info(arrCopied);
    }
}
class A{
    int[] arr;
    public A(int[] arr){
        this.arr = arr;
    }
    public int[] copyArr(){
        int[] a = new int[this.arr.length];
        for(int i = 0; i < this.arr.length; i++){
            a[i] = this.arr[i];
        }
        return a;
    }
    public void info(int[] arr){
        for(int j = 0; j < this.arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}