import java.util.Scanner;
public class StringLength {
    public static void main(String[] args){
        //输入一个字符串，输出它的长度
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();//scanner.next()会以空格为分隔符，会读取到空格停止，nextLine能包含空格
        System.out.println(a.length());
    }
}
