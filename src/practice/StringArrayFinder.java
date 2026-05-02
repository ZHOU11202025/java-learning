package practice;
//定义方法find，实现查找某字符串数组中的元素查找，并返回索引，如果找不到就返回-1
public class StringArrayFinder {
    public static void main(String[] args){
        A02 a =  new A02();
        String[] arr = {"44%","123","66"};
        String s = "6";
        int res = a.find(arr,s);
        if(res != -1){
            System.out.println("在该数组中找到相同元素，索引为：" + res);
        }
        else{
            System.out.println("在该数组中没找到");
        }
    }
}
class A02{
    public int find(String[] arr,String s){
        if(arr != null && arr.length != 0){
            for(int i = 0;i < arr.length;i++){
                if(arr[i].equals(s)){
                    return i;
                }
            }
        }
        return -1;
    }
}