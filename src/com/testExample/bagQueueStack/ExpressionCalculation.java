package com.testExample.bagQueueStack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 实现表达式运算
 */
public class ExpressionCalculation {
    public static void main(String[] args) {
        String calculation = "( 1 + ( 2 + 3 ) * ( 4 * 5 ) ) )";
        String calculation1 = "( ( 1 + sqrt ( 5.0 ) ) / 2.0 )";
        List<String> list = Arrays.asList(calculation.split(" "));
        List<String> list1 = Arrays.asList(calculation1.split(" "));
        System.out.println(calculation(list));
        System.out.println(calculation(list1));
    }

    public static double calculation(List<String> list) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i);
                if (temp.equals("(")) ;
                else if (temp.equals("+")) ops.push(temp);
                else if (temp.equals("-")) ops.push(temp);
                else if (temp.equals("*")) ops.push(temp);
                else if (temp.equals("/")) ops.push(temp);
                else if (temp.equals("sqrt")) ops.push(temp);
                else if (temp.equals(")")) {
                    String op = ops.pop();
                    double v = vals.pop();
                    if (op.equals("+")) v =  vals.pop() + v;
                    else if (op.equals("-")) v =  vals.pop() - v ;
                    else if (op.equals("*")) v =  vals.pop() * v;
                    else if (op.equals("/")) v =  vals.pop() / v;
                    else if (op.equals("sqrt")) v = Math.sqrt(v);

                    System.out.print("V:" + v + "\t");
                    vals.push(v);

                } else vals.push(Double.parseDouble(temp));
            }
        }
        System.out.println();
        double result = vals.pop();

        return result;
    }


}
