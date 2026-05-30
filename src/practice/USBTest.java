package practice;
//· 定义一个接口 USB，包含两个抽象方法：void start() 和 void stop()。
//· 创建两个实现类：Mouse 和 Keyboard，分别实现接口的方法（输出“鼠标启动/停止”和“键盘启动/停止”）。
//· 编写一个测试类 USBTest，在 main 方法中创建一个 USB 数组，存放 Mouse 和 Keyboard 对象，
//      遍历数组调用 start 和 stop 方法（体现多态）。
public class USBTest {
    public static void main(String[] args) {
        USB[] usbs = new USB[2];
        usbs[0] = new Mouse();
        usbs[1] = new Keyboard();
        for (int i = 0 ; i < usbs.length ; i++) {
            usbs[i].start();
            usbs[i].stop();
        }
    }
}
interface USB{
    void start();
    void stop();
}
class Mouse implements USB{
    @Override
    public void start() {
        System.out.println("鼠标启动");
    }
    public void stop() {
        System.out.println("鼠标停止");
    }
}
class Keyboard implements USB{
    @Override
    public void start() {
        System.out.println("键盘启动");
    }
    public void stop() {
        System.out.println("键盘停止");
    }
}