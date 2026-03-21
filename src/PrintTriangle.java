public class PrintTriangle {
    public static void main(String[] args){
        //打印一个直角三角形，第一行打印一个*，第二行打印两个*，...，共五行
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
