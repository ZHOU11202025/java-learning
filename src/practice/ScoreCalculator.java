package practice;
//有三个方法，分别返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），返回姓名和五门课成绩（总分）。
// 封装成一个可变参数的方法
public class ScoreCalculator {
    public static void main(String[] args){
        Score s =  new Score();
        s.score("张三",44,55);
        System.out.println(s.score("张三",44,55));
        System.out.println(s.score("李四",44,55,66));
        System.out.println(s.score("王五",44,55,66,77,88));
    }
}
class Score{
    public String score(String name,int...scores){
        int res = 0;
        for(int i = 0;i < scores.length;i++){
            res += scores[i];
        }
        return "姓名：" + name + " " + scores.length + "门课成绩总分：" + res;
    }
}