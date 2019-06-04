package math;

public class Question2 {
    /*题目：判断101-200之间有多少个素数，并输出所有素数。
     * 素数：只能被1或本身整除的数，如：3,5,7,11,131...
     */
    public static void main(String[] args) {
        solution(101,200);
    }
    public static int solution(int a,int b){
        int count =0;
        if(a==1){
            a=a+1;
        }
        boolean flag = true;
        for(int i=a;i<=b;i++){
            flag=true;
            for(int j=2;j<=b;j++){
                if(i!=j && i%j==0){
                    flag =false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(i);
            }
        }
        return count;
    }
    
}
