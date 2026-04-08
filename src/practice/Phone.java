package practice;
//定义Phone类，两个属性：brand，price，一个方法：showInfo(),输出如品牌：小米，价格：1999.0
public class Phone {
    public static void main(String[] args){
        PhoneIntro Phone1 = new PhoneIntro();
        Phone1.brand = "小米";
        Phone1.price = 1999.0;
        Phone1.showInfo();
    }
}
class PhoneIntro{
    String brand;
    double price;
    void showInfo(){
        System.out.println("品牌：" + brand + " 价格：" + price);
    }
}