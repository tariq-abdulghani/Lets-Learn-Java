package ch4_more_OOP.polymorphism.parametric.erasure;


import ch4_more_OOP.polymorphism.parametric.simplelist.Node;

public class MyNode extends Node<Integer> {
    public MyNode(Integer value) {
        super(value);
    }

    @Override
    public void setValue(Integer value) {
        System.out.println(value);
        super.setValue(value);
    }


    public String toStringRepr() {
       return "value %s".formatted(getValue());
    }
}
