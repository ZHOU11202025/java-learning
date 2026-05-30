package practice;

//· 设计一个 Singleton 类，使用饿汉式实现单例。
//· 私有构造方法，私有静态实例，公有静态获取方法。
//· 在 main 方法中多次调用获取方法，打印对象地址（System.out.println(singleton)），验证是否为同一个实例。
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("s1和s2是否为同一实例：" + (s1 == s2));
    }
}

class Singleton {
    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}