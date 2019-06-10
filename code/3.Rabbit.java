```java
public class Question1 {
    /* 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
     * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
     * 问每个月的兔子对数为多少？
     */
//找出数学关系，得到当你n>=3时，第n项的值为n-1和n-2的和，利用递归可得出
    public static void main(String[] args) {
        //循环解法
        double x = solution2(50);
        System.out.println(x);
        //递归解法
        System.out.println(solution1(50));

    }

    public static int solution1(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return solution1(n - 1) + solution1(n - 2);
        }
    }
    public static double solution2(int n) {
        int first = 1;
        int second = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 2) {
                count = 1;
            } else {
                count = first + second;
                first = second;
                second = count;

            }
        }
        return count;
    }

}```
//java代码
