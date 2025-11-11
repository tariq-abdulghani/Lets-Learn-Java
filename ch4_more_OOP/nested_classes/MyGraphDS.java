package ch4_more_OOP.nested_classes;


import java.util.*;

public class MyGraphDS<T>{
    private final List<MyGraphNode<T>> nodes;

    public MyGraphDS() {
        nodes = new ArrayList<>();
    }

    public MyGraphDS(MyGraphNode<T>[] nodes) {
        this();
        this.nodes.addAll(Arrays.asList(nodes));
    }

    /**
     * It will only be used with this class, and also it needs to access its private fields
     * that's why it's declared as inner class
     */
    class depthFirstSan implements Iterable<MyGraphNode<T>>, Iterator<MyGraphNode<T>>{
        Iterator<MyGraphNode<T>> iterator = nodes.iterator();
        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public MyGraphNode<T> next() {
            return iterator.next();
        }

        @Override
        public Iterator<MyGraphNode<T>> iterator() {
            return this;
        }
    }

    public Iterable<MyGraphNode<T>> depthFirstSan(){
        return new depthFirstSan();
    }
}
