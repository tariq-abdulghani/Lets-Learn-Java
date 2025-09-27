package ch4_more_OOP.polymorphism.parametric;

public class Demo {
    public static void main(String[] args) {
        OrderedPair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        OrderedPair<Integer, String> p2 = new OrderedPair<>(2, "pear");
        boolean same = Util.compare(p1, p2);
        System.out.printf("%s equals %s is %s%n", p1, p2, same);
    }
}
