package ch4_more_OOP.polymorphism.parametric;

import ch4_more_OOP.polymorphism.parametric.cache.Cacheable;

import java.util.List;

/**
 * Example of Generic method
 */
public class Util {
    public static <K, V> boolean compare(OrderedPair<K, V> p1, OrderedPair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static <I,T extends Cacheable<I>> boolean compare(T ob1, T ob2){
        return ob1.getId().equals(ob2.getId());
    }

    public static double sumList(List<? extends Number> list){
        double sum = 0;
        for (var num: list){
            sum+= num.doubleValue();
        }
        return sum;
    }
}
