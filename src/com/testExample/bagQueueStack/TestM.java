package com.testExample.bagQueueStack;

import org.junit.Test;

public class TestM {
    @Test
    public void Test1() {
        ResizingArraysStack<String> resizingArraysStack = new ResizingArraysStack<>();
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        resizingArraysStack.push(a);
        resizingArraysStack.push(c);
        resizingArraysStack.push(b);
        resizingArraysStack.push(d);
        System.out.println("弹出:" + resizingArraysStack.pop());
        System.out.print("栈:");
        for (String rs : resizingArraysStack) {
            System.out.print(rs + " ");
        }
    }
}
