public class PerfectNumber {
    /*
    *   题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。
    *   例如6=1＋2＋3。编程找出1000以内的所有完数。
    *
    *
    *
    * */
    public static void main(String[] args) {
        /*方法一：循环取1-1000的数，分别对小于其自身的正整数取余，将取余等于0的被除数
            相加--即是所有因子的和。
        * */
        for(int i=1;i<=1000;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
        /*方法二：根据公式，若p为质数，2^(p)-1也为质数，那么2^(p-1)*(2^(p)-1)
        为完数*/
    }
    public static void printPerNum(int range){
        int i=1;
        double perNum=0;
        while (true){
            boolean b = perNum(i);
            if (b){
                perNum=Math.pow(2,i-1)*(Math.pow(2,i)-1);
                if (perNum<=range){
                    System.out.println(perNum);
                }else {
                    break;
                }

            }
            i++;
        }
    }
    public static boolean perNum(int number){
        boolean flag=true;
        for(int i=2;i<Math.sqrt(number);i++){
            if(i!=number && number%i==0){
                flag= false;
            }
        }
        double num=Math.pow(2,number)-1;
        for(int i=2;i<Math.sqrt(num);i++){
            if(i!=number && number%i==0){
                flag= false;
            }
        }
        return flag;
    }
}
