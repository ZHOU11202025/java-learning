package practice;

import java.util.Arrays;
import java.util.Comparator;

//自定义Book类，里面包含 name 和 price ，按price排序（从大到小）
//有一个Book[] books = 5本书对象.
//使用前面学习过的传递 实现Comparato接口匿名内部类，也称为定制排序。
public class BookSortTest {
    public static void main(String[] args) {
        Book_[] books = new Book_[5];
        books[0] = new Book_("红楼梦",100);
        books[1] = new Book_("水浒传",90);
        books[2] = new Book_("西游记",110);
        books[3] = new Book_("三国演义",80);
        books[4] = new Book_("java",20);
        Arrays.sort(books, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Book_ book1 = (Book_)o1;
                Book_ book2 = (Book_)o2;
                double priceVal = book2.getPrice() - book1.getPrice();
                if(priceVal > 0)
                    return 1;
                else if(priceVal < 0)
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println("按价格从大到小排序： " + Arrays.toString(books));
    }
}
class Book_{
    private String name;
    private  double price;
    public Book_() {}
    public Book_(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "书名:" + name + ",价格:" + price;
    }
}