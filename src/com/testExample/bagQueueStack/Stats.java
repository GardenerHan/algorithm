package com.testExample.bagQueueStack;

import java.util.Stack;

public class Stats {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>() ;
        stack.push(12) ;
        //int i = stack.pop() ;
       int k =  stack.peek() ;
       // System.out.println(i);
        System.out.println(k);
    }
}
