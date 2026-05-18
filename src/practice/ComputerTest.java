package practice;
//编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回
//Computer的详细信息
//编写PC子类，继承Computer类，添加特有属性【品牌brand
//编写NotePad子类，继承Computer类，添加特有属性【颜色color
//编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性
//赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息。
public class ComputerTest {
    public static void main(String[] args) {
        PC pc = new PC();
        NotePad np = new NotePad();
        pc.brand = "Honor";
        pc.CPU = "Intel";
        pc.memory = "16GB";
        pc.hardDisk = "512GB";
        System.out.println("品牌：" + pc.brand + " " + pc.getDetails());

        np.color = "black";
        np.CPU = "AMD";
        np.memory = "8GB";
        np.hardDisk = "256GB";
        System.out.println("颜色：" + np.color + " " + np.getDetails());
    }
}
class Computer{
    String CPU;
    String memory;
    String hardDisk;
    public Computer(){}
    public Computer(String CPU, String memory, String hardDisk){
        this.CPU = CPU;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }
    public String getDetails(){
        return "CPU:" + CPU + " 内存:" + memory + " 硬盘:" + hardDisk;
    }
}
class PC extends Computer{
    String brand;
}
class NotePad extends Computer{
    String color;
}