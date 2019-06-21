public class ThreeUnary {
    /*
    * 题目：利用条件运算符的嵌套来完成此题：
    * 学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
    *
    *
    * */
    public static void main(String[] args) {
        System.out.println(show(50));
    }
    public static String show(int grade){
        return grade>=90? "A":grade>=60? "B":"C";
    }
}
