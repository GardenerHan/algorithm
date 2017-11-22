package com.testExample.one;

import myalgorithm.basics.StdIn;
import myalgorithm.basics.StdOut;

public class Average {
    public static void main(String[] args) {
        double sum = 0.0 ;
        int cnt = 0 ;
        while (!StdIn.isEmpty()){
            sum += StdIn.readDouble() ;
            cnt ++ ;

        }
        double avg = sum /cnt ;
        StdOut.printf("Average is %.5f\n",avg);
        StdOut.printf("Average is %14.2f\n",avg);
    }
}
