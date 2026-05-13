package practice;
import java.util.Random;
import java.util.Scanner;
//有个人Tom设计他的成员变量，成员方法，可以电脑猜拳，
// 电脑每次都会随机生成0（石头），1（剪刀），2（布），并要显示Tom的输赢次数（清单）
public class GuessGame {
    public static void main(String[] args) {
        Tom t = new Tom();
        int isWinCount = 0;//最终赢的次数
        int[][] arr1 = new int[3][3];//接收局数，Tom出拳，电脑出拳
        String[] arr2 = new String[3];//接收输赢

        Scanner sc = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i < 3; i++) {
            //获取玩家出拳
            System.out.println("输入你的出拳情况：0~2");
            int num = sc.nextInt();
            t.setTomGuessNum(num);
            int tomGuessNum = t.getTomGuessNum();
            arr1[i][j + 1] = tomGuessNum;
            //获取电脑出拳
            int computerGuessNum = t.computerNum();
            arr1[i][j + 2] = computerGuessNum;
            //进行比较
            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;

            System.out.println("===========================");
            System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
            System.out.println(t.count + "\t" + tomGuessNum + "\t\t" + computerGuessNum + "\t\t" + isWin);
            System.out.println("===========================");
            isWinCount = t.winCount(isWin);


        }
        System.out.println();
        System.out.println("你赢了" + isWinCount + "次");
    }
}
class Tom{
    int tomGuessNum;//玩家出拳
    int computerGuessNum;//电脑出拳
    int winCountNum = 0;//玩家赢次数
    int count = 1;//一共比赛三次

    public int computerNum(){
        Random r = new Random();
        computerGuessNum = r.nextInt(3);
        return computerGuessNum;
    }

    public void setTomGuessNum(int tomGuessNum){
        if(tomGuessNum < 0 || tomGuessNum > 2){
            System.out.println("数字输入错误");
            this.tomGuessNum = tomGuessNum;
        }
    }

    public int getTomGuessNum(){
        return tomGuessNum;
    }

    public String vsComputer(){
        if(tomGuessNum == 0 && computerGuessNum == 1){
            return "你赢了";
        }
        else if(tomGuessNum == 1 && computerGuessNum == 2){
            return "你赢了";
        }
        else if(tomGuessNum == 2 && computerGuessNum == 0){
            return "你赢了";
        }
        else if(tomGuessNum == computerGuessNum){
            return "平局";
        }
        else {
            return "你输了";
        }
    }

    public int winCount(String s){
        count++;
        if(s.equals("你赢了")){
            winCountNum++;
        }
        return winCountNum;
    }
}
