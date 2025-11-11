package ch4_more_OOP.nested_classes;

import java.util.List;

public record MyGraphNode<T>(T value, List<MyGraphNode<T>> linkedGraphNodes) {
}
