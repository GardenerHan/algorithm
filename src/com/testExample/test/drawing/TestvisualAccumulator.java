package com.testExample.test.drawing;

import myalgorithm.basics.StdOut;
import myalgorithm.basics.StdRandom;

public class TestvisualAccumulator {
    public static void main(String[] args) {
        int T = 2000 ;
        visualAccumulator a = new visualAccumulator(T,1.0) ;
        for (int i = 0 ; i < T;i++){
            a.addDataValue(StdRandom.random());
            StdOut.println(a);
          //  System.out.println(a.getClass());
        }

    }
}
