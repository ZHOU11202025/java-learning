package practice;
//编写应用程序EcmDef.java，接收命令行的两个参数(整数)，计算两数相除。
// a)计算两个数相除，要求使用方法cal(int n1,int n2)
// b)对数据格式不正确、缺少命令行参数、除0进行异常处理。
public class DivisionCalculator {
    public static void main(String[] args) {
        try {
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            double res = cal(a , b);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确");
        } catch (ArithmeticException e) {
            System.out.println("出现了0的异常");
        }
    }
    public static double cal(int a,int b){
        return a / b;
    }
}
