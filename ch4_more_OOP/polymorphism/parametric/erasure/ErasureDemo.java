package ch4_more_OOP.polymorphism.parametric.erasure;

import ch4_more_OOP.polymorphism.parametric.simplelist.Node;

public class ErasureDemo {
    public static void main(String[] args) {
        MyNode myNode = new MyNode(10);
        Node node = myNode;
//        run time error class casting exception due to bridged methods created
//        node.setValue("Hello World");
    }
}
