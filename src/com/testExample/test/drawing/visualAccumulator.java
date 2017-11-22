package com.testExample.test.drawing;

import myalgorithm.basics.StdDraw;

public class visualAccumulator {
    private  double total ;
    private  int N ;

    public visualAccumulator(int trials, double max) {
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(.005);
    }

    public visualAccumulator() {
    }

    public  void addDataValue(double val){
        N++ ;
        total += val ;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);
        System.out.println(N);
    }

    @Override
    public String toString() {
        return "visualAccumulator{" +
                "total=" + total +
                ", N=" + N +
                '}';
    }
}
