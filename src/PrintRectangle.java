public class PrintRectangle {
    public static void main(String[] args) {
        //使用两层for循环，打印五行五列的星号矩形
        int i = 0;
        int j = 0;
        for(i = 0;i < 5;i++){
            for(j = 0;j < 5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
