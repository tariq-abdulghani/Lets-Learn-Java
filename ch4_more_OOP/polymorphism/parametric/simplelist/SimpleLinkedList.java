package ch4_more_OOP.polymorphism.parametric.simplelist;

import java.lang.reflect.Array;

public class SimpleLinkedList <T>{
    private int size = 0;
    private Node<T> head;

    public SimpleLinkedList(){
    }

    @SafeVarargs
    public SimpleLinkedList(T... items){
        head = new Node<>(items[0]);
        var currentNode = head;
        for (int i = 0; i < items.length; i++) {
            if(i!=0){
                var node = new Node<>(items[i]);
                currentNode.setNext(node);
                currentNode = node;
            }
        }
        size = items.length;
    }

    public void addItem(T item){
        var node  = new Node<>(item);
        node.setNext(head);
        this.head = node;
        size++;
    }

    public void removeItem(T item){
        var currentNode = head;
        if(head == null) return;
        if(head.getValue().equals(item)){
            head = head.getNext();
            size--;
        }
        else if(head.getNext() != null){
            while (currentNode != null ){
                if(currentNode.getNext().getValue().equals(item)){
                    var nextNext = currentNode.getNext().getNext();
                    currentNode.setNext(nextNext);
                    size--;
                    break;
                }
                currentNode = currentNode.getNext();
            }
        }

    }

    public int getSize() {
        return size;
    }

    public T[] toArray(Class<T> clss){
        var arrayValue = (T[]) Array.newInstance(clss, getSize());
        int index = 0;
        var currentNode = head;
        while (currentNode != null ){
          arrayValue[index++] = currentNode.getValue();
          currentNode = currentNode.getNext();
        }
       return arrayValue;
    }

    public static <U> String toString(SimpleLinkedList<U> list){
        StringBuilder sb = new StringBuilder("[");
        var currentNode = list.head;
        while (currentNode != null ){
            sb.append(currentNode.getValue());
            if(currentNode.getNext() != null){
                sb.append(", ");
            }
            currentNode = currentNode.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
        return SimpleLinkedList.toString(this);
    }
}
