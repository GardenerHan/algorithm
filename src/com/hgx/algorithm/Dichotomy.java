package com.hgx.algorithm;


//二分法查找
public class Dichotomy {
    public static void main(String[] args) {
       int  N = 21 ;
       int[] array = new int[N] ;
       for (int i = 0 ; i < N;i++){
           array[i] = i+1 ;
           System.out.print(array[i]);
       }
        System.out.println();
        rank(14,array) ;
    }
    public  static int rank(int key ,int[] a){
        //数组a是有序的
        int lo = 0 ;
        //key = 7 14
        //加一打印:---mid :11---mid :5---mid :8---mid :6            ---mid :11---mid :17---mid :14---mid :12---mid :13
        //减一打印:---mid :10---mid :4---mid :7---mid :5---mid :6   ---mid :10---mid :15---mid :12---mid :13
        int hi = a.length - 1 ;

        while (lo <= hi){
            int mid = lo+(hi-lo)/2 ;
            System.out.print("---mid :"+mid);
            if (key < a[mid]) hi = mid-1 ;
            else if (key > a[mid] ) lo = mid +1 ;
            else  return mid ;

        }
        return  -1 ;

    }
}
