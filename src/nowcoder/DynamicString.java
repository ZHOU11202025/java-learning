package nowcoder;

import java.util.Scanner;
//将一个由英文字母组成的字符串转换成从末尾开始每三个字母用逗号分隔的形式。
public class DynamicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        //write your code here......
        int count = 1;
        String result = "";
        for(int i = str.length() - 1;i >= 0;i--){
            if(count % 3 == 0){
                result = "" + ',' + str.charAt(i) + result;
            }
            else{
                result = "" + str.charAt(i) + result;
            }
            count++;
        }
        if(result.charAt(0) == ','){
            result = result.substring(1);
        }
        System.out.println(result);
    }
}