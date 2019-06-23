public class GreatestCommonDivisor {
    /*
    * 输入两个正整数m和n，求其最大公约数和最小公倍数。
    * */
    /*最大公约数为最大公因数，也称最大公约数、最大公因子，指两个
     或多个整数共有约数中最大的一个*/
    //可以用辗转相除法进行计算最大公约数
        /*
        * 用较大的数对较小的数取余，接着用较小的数对余数取余，直到余数为0时，被除数为
        * 最小公约数
        * 例如：72%32=8
        *       32%8=0
        *       最小公约数为8
        * */
    //最小公倍数等于两数相乘除以最大公约数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int m=scanner.nextInt();
        System.out.println("请输入第二个数");
        int n=scanner.nextInt();
        //最大公约数
        int x =divisor(99,1110);
        //最小公倍数
        int y=m*n/x;
    }

    public static int  divisor(int m,int n){

        //将小的值放在前面
        if(m>n){
            int temp = m;
            m=n;
            n=temp;
        }
        //定义余数
        int x;
        //被除数为0退出
        while (m!=0){
            x=n%m;
            if(x==0){
                return m;
            }
            n=m;
            m=x;

        }

        return -1;
    }
}
