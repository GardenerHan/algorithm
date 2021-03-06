package com.testExample.test.drawing;

import myalgorithm.basics.StdDraw;
import myalgorithm.basics.StdRandom;

import java.awt.*;

public class RandomArray {
    public static void main(String[] args) {
        int N = 50;
        StdDraw.setPenColor(Color.red);
        StdDraw.clear(Color.blue);
        double[] a = new double[N] ;
        for (int i = 0 ; i < N ;i++){
            a[i] = StdRandom.random() ;

        }
        for (int i = 0 ; i < N ;i++){
            double x = 1.0*i/N ;
            double y = a[i]/2.0 ;
            double rw = 0.5/N ;
            double rh = a[i]/2.0 ;
            StdDraw.filledRectangle(x,y,rw,rh);

        }
    }
}
