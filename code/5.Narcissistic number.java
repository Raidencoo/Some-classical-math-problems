/*
    打印水仙花数
    水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
*/
    public static void main(String[] args) throws ClassNotFoundException {
        printNarcissisticNumber();

    }
    private static void printNarcissisticNumber() {
        //获取所有的3位数
        for(int i=100;i<1000;i++){
            //获取3位数的十位、百位、个位
            int hundreds= i/100;
            int decade = i%100/10;
            int unitDigit = i%100%10;
            //得到3次方的和
            double sum =Math.pow(hundreds,3)+Math.pow(decade,3)+Math.pow(unitDigit,3);
            //比较输出
            if(i==(int)sum){
                System.out.println(i);
            }
        }
    }
