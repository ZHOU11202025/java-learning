package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        boolean loop = true;

        while(loop){
            System.out.println("----------------零钱通菜单---------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.print("请选择（1-4）：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    menu.choice1();
                    break;
                case 2:
                    System.out.print("输入收益金额：");
                    double money = sc.nextDouble();
                    if(money <= 0){
                        System.out.println("输入收益金额有误");
                        break;
                    }
                    menu.choice2(money);
                    break;
                case 3:
                    System.out.print("输入消费项目名称：");
                    String costName = sc.next();
                    System.out.print("输入消费金额：");
                    double cost = sc.nextDouble();
                    if(cost <= 0){
                        System.out.println("输入消费金额有误");
                        break;
                    }
                    boolean success = menu.choice3(costName,cost);
                    if(!success){
                        System.out.println("余额不足，消费失败");
                    }
                    break;
                case 4:
                    boolean judge = true;
                    while(judge){
                        System.out.println("你确定要退出吗？y/n");
                        char answer = sc.next().charAt(0);
                        if(answer == 'y' || answer == 'n'){
                            judge = false;
                            if(answer == 'y'){
                                loop = false;
                                System.out.println("退出系统");
                            }
                            else{
                                break;
                            }
                        }
                        else{
                            System.out.println("输入有误");
                        }
                    }
                    break;
                default:
                    System.out.println("输入有误");
            }
        }
    }
}
class Menu{
    private StringBuilder details = new StringBuilder();
    private double change;

    public void choice1(){
        System.out.println("----------------零钱通明细---------------");
        if(details.length() == 0){
            System.out.println("暂无明细");
        }
        else{
            System.out.println(details.toString());
        }
    }
    public void choice2(double money){
        change += money;
        String formatted = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        details.append("收益入账\t+").append(money).append("\t").append(formatted).append("\t余额：")
                .append(change).append("\n");
        System.out.println("入账成功");
    }
    public boolean choice3(String costName,double cost){
        if(cost > change){
            return false;
        }
        else{
            change -= cost;
            String formatted = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            details.append(costName).append("\t-").append(cost).append("\t").append(formatted).append("\t余额：")
                    .append(change).append("\n");
            System.out.println("消费成功");
            return true;
        }

    }
}