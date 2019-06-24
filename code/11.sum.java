public class Sum {

    /*
    *  题目：求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。
    *  例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。
    *  分析：根据数额学关系，假设计算值为m,计算次数为n，那么第n项为10的n-1次方乘以m,即为：
        an=10^(n-1)*n+a(n-1);
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的数字：");
        int num = scanner.nextInt();
        System.out.println("请输入要计算次数：");
        int count = scanner.nextInt();
        //初始化变量
        int sum=0;
        int n=0;
        //循环计算
        for(int i=1;i<=count;i++){
            n+=num;
            num=num*10;
            sum+=n;

        }

        System.out.println(sum);

    }

    public static double an(int number,int count) {
        //递归计算每项
        if (count==1){
            return number;
        }
        double v = Math.pow(10, count - 1);
        double num=v*number;
        return num+an(number,count-1);


    }

}
