public class Matrix {
    /*
    * 输入一个矩阵，并按从外向里顺时针方向输出数据
    *举例
    *1  2  3
    *4  5  6
    *7  8  9
    *输出顺序：1 2 3 6 3 8 7 4 5....
    *
    * 分析：1.将输入数据保存在二维数组中，最后从二维数组提出数据。
    *      2.提出数据时，先取最外层数据，在依次取内层，都是统一操作，所以可以用递归
    *      3.将数组下标最小值定为start，最大值定为end
    *      4实现步骤：
    *      第一层：从首行开始输出，直到列数的末尾
    *            然后从末尾向下输出直到行数的末尾
    *            从最后一行行数末尾开始输出到最后一行的开头
    *            从最后一行的开头输出每一行的第一个数字（除去第一个）、
    *       第二层则将外层数组下标最小值加一，最大值减一，内层数组最小值加一，
    *       最大值减一，递归调用则能实现
    *
    * */
    public static void main(String[] args) {
        int[][]matrix = input(8);
        output(matrix,0,7);
    }
    public static int[][] input(int n){
        //创建二维数组
        int[][] matrix=new int[n][n];
        int count=0;//变化赋值
        //循环，外层循环控制行数，内层控制列数
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=++count;

            }
        }
        return matrix;
    }
    public static void output(int[][] matrix,int start,int end){
        //退出条件，由于是n*n行矩阵，最后一层start最多只能等于end
        if(start>end || end<=0){
            return;
        }
        //输出第一层顺时针第一行
        for(int i=start;i<end;i++){
            System.out.println(matrix[start][i]);
        }
        //输出第一层顺时针最后一列的数
        for(int i=start+1;i<end;i++){
            System.out.println(matrix[i][end]);
        }
        //输出第一层顺时针最后一行的数（从最后一个数开始输出）
        for(int i=end-1;i>=start;i--){
            System.out.println(matrix[end][i]);
        }
        //输出第一层顺时针第一列的数（从最后一列开始输出）
        for(int i=end-1;i>start;i--){
            System.out.println(matrix[i][start]);
        }
        //递归调用输出第二层的数
        output(matrix,start+1,end-1);
    }
}
