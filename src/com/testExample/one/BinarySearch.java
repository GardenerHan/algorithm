package com.testExample.one;

import myalgorithm.basics.In;
import myalgorithm.basics.StdIn;
import myalgorithm.basics.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //args[0]是一个txt文件
        int[] whitelist = In.readInts(args[0]) ;
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()){
            int key = StdIn.readInt() - 1  ;
            if (rank(key,whitelist) == -1){
                StdOut.print(key);
            }
        }
    }
    public static int rank(int key,int[] a){
        int lo = 0 ;
        int hi = a.length -1 ;
        while (lo <= hi){
            int mid  = lo +(hi - lo)/2 ;
            if (key == a[mid]) hi = mid -1 ;
            else if (key > a[mid]) lo = mid -1 ;
            else return mid ;
        }
        return  -1 ;

    }
}
