package practice;

//· 定义一个接口 Calculator，包含方法 int calculate(int a, int b);
//· 在 main 方法中，使用匿名内部类分别实现加法、减法、乘法和除法（注意除数为0的情况）。
//· 分别调用并打印结果（例如：5 + 3 = 8）。
public class CalculatorDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Calculator_ add = new Calculator_(){
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        Calculator_ sub = new Calculator_(){
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        Calculator_ multiply = new Calculator_(){
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        Calculator_ divide = new Calculator_(){
            @Override
            public int calculate(int a, int b) {
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("除数不能为零");
                    return 0;
                }
            }
        };
        System.out.println(a + " + " + b  + " = " + add.calculate(a,b));
        System.out.println(a + " - " + b  + " = " + sub.calculate(a,b));
        System.out.println(a + " * " + b  + " = " + multiply.calculate(a,b));
        System.out.println(a + " / " + b  + " = " + divide.calculate(a,b));
        System.out.println(5 + " / " + 0 + " = "+ divide.calculate(5,0));
    }
}
interface Calculator_ {
    int calculate(int a, int b);
}