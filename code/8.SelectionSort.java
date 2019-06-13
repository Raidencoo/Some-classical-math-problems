public class SelectionSort {
    /*
    * 选择排序：
    * 取集合中的一个元素，然后一一与其他元素做比较，如果该元素小于比较的元素
    * 则将比较的元素的Index保留下来，然后用该元素与其他元素比较，这样一轮比较下来
    * 就会得到集合中最大值元素的index。
    * 例如：取一个集合元素为a,index为0，与集合中
    * b元素index为1比较，小于则将b元素的index记录下，用b元素再与集合中其他元素比较
    * 以此类推....然后根据index将最大值元素与集合最后一个元素替换，这样就把集合中最大的
    * 元素放在最后。
    * 第二轮比较则只需比较前n-1个元素，将最大值元素放在n-1的位置。
    * 当只有两个元素比较的时候，为最后一次比较，即是已经将n-2个元素放好了位置，此时为最后
    * 一次交换位置，则共需要比较n-1次。
    *
    * */
    public static void main(String[] args) {
        int[] arr ={12,23,28,11,9,1,99,27,15};
        selectionSort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void selectionSort(int[] arr){


        //比较n-1次
        for(int i=0;i<arr.length-1;i++){
            //取数组第一个元素的index
            int index = 0;
            //循环比较，第二次则只需比较前n-1个元素
            for(int j=1;j<arr.length-i;j++){
                if(arr[index]<arr[j]){
                    //将值更大的元素的index保留下来
                    index=j;
                }
            }
            //一轮比较结束后，此时的index为集合中最大元素的index
            if((arr.length - i)!=index) {
                int temp = arr[arr.length-i-1];
                arr[arr.length - i-1] = arr[index];
                arr[index] = temp;
            }
        }
    }

}
