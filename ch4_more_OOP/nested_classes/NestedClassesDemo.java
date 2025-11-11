package ch4_more_OOP.nested_classes;

import java.util.List;

public class NestedClassesDemo {
    public static void main(String[] args) {
        MyGraphNode<String> nodeA = new MyGraphNode<>("A", List.of());
        MyGraphNode<String> nodeB = new MyGraphNode<>("B", List.of(nodeA));
        MyGraphNode<String> nodeC = new MyGraphNode<>("C", List.of(nodeA));
        MyGraphNode<String> nodeD = new MyGraphNode<>("d", List.of(nodeB, nodeC));

        MyGraphDS<String> abcdRectangle = new MyGraphDS<>(new MyGraphNode[]{nodeA, nodeB, nodeC, nodeD});
        for (var node : abcdRectangle.depthFirstSan()){
            System.out.println(node);
        }
    }
}
