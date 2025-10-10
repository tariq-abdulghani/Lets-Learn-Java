package ch4_more_OOP.polymorphism.parametric;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        OrderedPair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        OrderedPair<Integer, String> p2 = new OrderedPair<>(2, "pear");
        boolean same = Util.compare(p1, p2);
        System.out.printf("%s equals %s is %s%n", p1, p2, same);

        List<String> names = new ArrayList<>();
//        List<Object> objectList = names; // error
        List<?> objects = names;
        List rawList = objects;


//  Wildcard demos
        // can be considered readonly since you cannot apply any modifications that requires type capture without helper methods
        List<? extends Number> numbers;
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();

        numbers = integers;
//        errors 
//        numbers.add( new Double(9.0));
//        numbers.add(90);
    }

    static void foo(List<?> list){
//        type capture error why? we can not set any item in the list
//        ,but we don't know what type should be included.
//        list.set(0, list.get(0));
        fooHelper(list);
    }

//    static void foo(List<?> list){
////        type capture error why? we can not set any item in the list
////        ,but we don't know what type should be included.
//        list.set(0, list.get(0));
//    }

//    with T we made the constraint that all elements are of type T.
//    so even if we don't know T but all items in the list will be
//    of the same type.
    private static <T>void fooHelper(List<T> list){
        list.set(0, list.get(0));
    }



}
