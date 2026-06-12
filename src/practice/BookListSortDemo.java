package practice;

import java.util.*;

//使用List的实现类添加三本图书，并遍历，打印如下效果，
//名称:xx    价格:XX   作者:xx，
// 要求:1)按价格排序,从低到高(使用冒泡法)
// 2)要求使用ArrayList、LinkedList 和 Vector 三种集合实现
public class BookListSortDemo {
    public static void main(String[] args) {
        Book1 book1 = new Book1("西游记", 90, "吴承恩");
        Book1 book2 = new Book1("三国演义", 80, "罗贯中");
        Book1 book3 = new Book1("水浒传", 87, "施耐庵");
        List list1 = new ArrayList();
        list1.add(book1);
        list1.add(book2);
        list1.add(book3);
        Book1.BubbleSort(list1);
        for (Object o : list1) {
            System.out.println(o);
            System.out.println();
        }
        List list2 = new LinkedList();
        list2.add(book1);
        list2.add(book2);
        list2.add(book3);
        Book1.BubbleSort(list2);
        for (Object o : list2) {
            System.out.println(o);
            System.out.println();
        }
        List list3 = new Vector();
        list3.add(book1);
        list3.add(book2);
        list3.add(book3);
        Book1.BubbleSort(list3);
        for (Object o : list3) {
            System.out.println(o);
            System.out.println();
        }
    }
}

class Book1 {
    private String name;
    private double price;
    private String author;

    public Book1(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public static void BubbleSort(List list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "名称:" + name + "\t价格:" + price + "\t作者:" + author;
    }
}