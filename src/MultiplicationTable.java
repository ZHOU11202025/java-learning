public class MultiplicationTable {
    public static void main(String[] args){
        //用两层for循环,输出九九乘法表
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i + "x" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
