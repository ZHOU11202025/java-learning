package practice;
//输入一个句子（含空格），输出其中的单词个数
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();//nextLine会读取空格及之后，next则不会
        int count = 0;
        for(int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            if (c == ' '){
                count++;
            }
        }
        count++;
        System.out.println("句子中含有" + count + "个单词");
    }
}
