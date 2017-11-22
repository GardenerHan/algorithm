package com.testExample.test.drawing;

import myalgorithm.basics.StdDraw;

import java.awt.*;

public class TestLine {
    public static void main(String[] args) {
        StdDraw.setXscale(0,4);
        StdDraw.setYscale(0,4);
        StdDraw.setPenRadius(0.01);
        StdDraw.clear(Color.blue);
        StdDraw.setPenColor(Color.red);
      //  StdDraw.point(1,2);
        StdDraw.line(1,1,2,2);
    }
}
