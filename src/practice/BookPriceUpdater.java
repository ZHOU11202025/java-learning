package practice;
//定义方法updatePrice，实现更改某本书的价格，具体：如果价格>150，则更改为150，如果价格>100，更改为100，否则不变
public class BookPriceUpdater {
    public static void main(String[] args){
        Book b = new Book(200);
        b.info();
        b.updatePrice();
        b.info();
    }
}
class Book{
    double price;
    public Book(double price){
        this.price = price;
    }
    public void updatePrice(){
        if(this.price > 150){
            this.price = 150;
        }
        else if(this.price > 100){
            this.price = 100;
        }
        System.out.println("=== 经历价格变动后 ===");
    }
    public void info(){
        System.out.println("这本书价格为：" + this.price);
    }
}