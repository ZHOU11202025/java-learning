package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//添加10个以上的元素(比如String"hello”)，在2号位插入一个元素”韩顺平教育"，
//获得第5个元素，删除第6个元素，修改第7个元素，在使用迭代器遍历集合，
//要求:使用List的实现类ArrayList完成。
public class ListOperationDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        System.out.println(list);
        list.add(1,"韩顺平教育");
        System.out.println("2号位插入元素‘韩顺平教育’:" + list);
        System.out.println("获得第五个元素：" + list.get(4));
        list.remove(5);
        System.out.println("删除第六个元素：" + list);
        list.set(6,"ok");
        System.out.println("修改第七个元素：" + list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(" " + next);
        }
    }
}
