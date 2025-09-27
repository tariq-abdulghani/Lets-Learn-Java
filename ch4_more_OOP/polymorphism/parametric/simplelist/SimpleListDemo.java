package ch4_more_OOP.polymorphism.parametric.simplelist;

public class SimpleListDemo {
    public static void main(String[] args) {

        SimpleLinkedList<String> names = new SimpleLinkedList<>("Ahmed", "Saed", "John", "Peter", "Vladimir");
        System.out.println(names.getSize());
        System.out.println(names);
        System.out.println(SimpleLinkedList.toString(names));

//        names.removeItem("Saed");
//        System.out.printf("%s size: %d\n", names, names.getSize());
//
//        names.removeItem("Vladimir");
//        System.out.printf("%s size: %d\n", names, names.getSize());
//
//        names.removeItem("Ahmed");
//        System.out.printf("%s size: %d\n", names, names.getSize());
//
//        names.removeItem("Peter");
//        System.out.printf("%s size: %d\n", names, names.getSize());
//
//        names.removeItem("John");
//        System.out.printf("%s size: %d\n", names, names.getSize());
//
//        names.removeItem("John");
//        System.out.printf("%s size: %d\n", names, names.getSize());
//        names.addItem("John Doe");
//        System.out.printf("%s size: %d\n", names, names.getSize());
//        names.removeItem("John");
//        System.out.printf("%s size: %d\n", names, names.getSize());
//        names.removeItem("John Doe");
//        System.out.printf("%s size: %d\n", names, names.getSize());
    }
}
