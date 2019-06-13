public class BinarySearch {
    /*
    * 二分查找法
    * 集合中有序
    * 假如集合升序。
    * 设置开始值为0，末尾为集合长度-1
    * 折半查询，若查询数值大于中间的数值，则查询数值在后半部分，将开始位置设置为middle+1
    * 若查询数值小于中间数值，则将末尾设置为middle-1，相等则返回true
    * */
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,10,12,14,18,19};
        boolean b = binarySearch(arr, 19);
        System.out.println(b);


    }
    public static boolean binarySearch(int[] arr,int x){
        //设置开始与结束位置
        int start=0;
        int end=arr.length-1;
        //循环查找，当开始位置大于结束位置时结束查询
        while (!(start>end)) {
            //设置中间值
            int middle = (start+end)/2;
            //大于中间值则查询后半部分，将开始位置设置为中间位置+1
            if(x>arr[middle]){
                start=middle+1;

            }else if(x<arr[middle]){
                //小于中间值则查询前半部分，将结束位置设置为中间位置-1
                end=middle-1;
            }else {
                //相等则返回true
                return true;
            }
        }
        //都不相等返回false
        return false;
    }

}
