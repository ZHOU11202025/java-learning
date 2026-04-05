package nowcoder;

import java.util.Scanner;
//给定一个字符串，随机输入一个字母，判断该字母在这个字符串中出现的次数
public class LetterCounter {
    public static void main(String[] args) {
        String string = "H e l l o ! n o w c o d e r";
        Scanner scanner= new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        System.out.println(check(string, word));
    }

    public static int check(String str, String word) {

        //write your code here......
        int count = 0;
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            String s = "" + c;
            if(s.equals(word) == true){
                count++;
            }
        }
        return count;
    }
}