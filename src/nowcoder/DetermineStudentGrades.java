package nowcoder;

import java.util.Scanner;
//现有如下成绩等级A,B,C,D。其中A代表优秀，B代表良好，C代表及格，D代表不及格。如果用户输入错误则输出未知等级。
public class DetermineStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade =scanner.next();

        //write your code here......
        switch(grade){
            case "A":
                System.out.println("优秀");
                break;
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("及格");
                break;
            case "D":
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}