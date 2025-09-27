package ch4_more_OOP.polymorphism.parametric;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo of Boxing and unboxing
 */
public class Unboxing {

    public static void main(String[] args) {
        // boxing
        //Integer i = Integer.valueOf(-8);
        Integer i = -8;

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(i);
        System.out.println("absolute value of " + i + " = " + absVal);

        List<Double> ld = new ArrayList<>();
        ld.add(3.1416);    // Π is autoboxed through method invocation.

        // 2. Unboxing through assignment
        double pi = ld.get(0);
        System.out.println("pi = " + pi);
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}
