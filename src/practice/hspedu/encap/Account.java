package practice.hspedu.encap;

//创建程序，在其中定义两个类Account和AccountTest类体会java的封装性
//1.Account类要求具有属性：姓名（长度为二位三位或四位），余额（必须>20）,密码（必须是六位），
// 如果不满足，则给出提示信息，并给默认值
//2.通过setXxx的方法给Account的属性赋值
//3.在AccountTest中测试
public class Account {
    private String name;
    private int money;
    private String password;

    public Account() {
    }

    public Account(String name, int money, String password) {
        setName(name);
        setMoney(money);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if (len == 2 || len == 3 || len == 4) {
            this.name = name;
        } else {
            System.out.println("不满足要求，设为默认值无名");
            this.name = "无名";
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 20) {
            this.money = money;
        } else {
            System.out.println("不满足要求，设为默认值0");
            this.money = 0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int len = password.length();
        if (len == 6) {
            this.password = password;
        } else {
            System.out.println("不满足要求，设为默认值1");
            this.password = "";
        }
    }

    public void info() {
        System.out.println("信息为 姓名：" + getName() + " 余额：" + getMoney() + " 密码：" + getPassword());
    }

}


