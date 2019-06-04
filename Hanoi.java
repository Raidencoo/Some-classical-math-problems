/*背景故事
汉罗塔游戏源于印度神话中的大梵天创造的三个金刚柱，一根柱子上叠着上下从小到大64个黄金圆盘。大梵天命令婆罗门将这些圆盘按从小到大的顺序移动到另一根柱子上，
其中大圆盘不能放在小圆盘上面。当这64个圆盘移动完的时候，世界就将毁灭。 
  问题数学分析：三个柱子分别命名为a , b , c,默认圆盘在a柱上，此时将其全部移动到c柱上
  1.假设有1个圆盘，将圆盘移动到另一柱子需要   1   次；
  2.假设有2个圆盘，则需要将a柱上的第一个圆盘移动到b柱（缓冲柱）,将最底层的圆盘移动c柱，然后将b柱上的圆盘移动到c柱，此时一共需要 3 次；
  3.假设有3个圆盘，则需要将a柱上的2个圆盘移动到b柱（此时同2个圆盘的次数，只是柱子不一样），然后将底层盘子移动到c柱，再将b柱上的两个圆盘移动到c柱，移动
  完成总体需要：
              1.第一步：移动a柱上两个顶层圆盘到b柱的次数 3 次；
              2.第二步：移动a柱底层圆盘到c柱 1  次；
              3.第三步：移动 b柱上的两个圆盘到c柱的次数 3  次；
  4.假设有四个圆盘，同3个圆盘的移动方式，需要 15 次.....
  我们可以将移动一个圆盘称为 a1,2个圆盘为a2.....则移动n个圆盘称为an;
  那么得到数列关系：an = 2a(n-1)+1
    
*/
//代码如下：
  public static void main(String[] args){
      //移动次数
      System.out.println(hanoi(10));
  
  } 
  public static int hanoi(int n){
    //递归退出条件：n==1时
    if(n==1){
        return 1;
    }else{
        //返回2a(n-1)+1
        return 2*hanoi(n-1)+1;
      
      }
  }