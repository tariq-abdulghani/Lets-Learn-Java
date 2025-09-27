package ch4_more_OOP.polymorphism.parametric;

import java.security.InvalidParameterException;
import java.util.Objects;

/**
 * Example of Multi param Generic Class
 * @param <K>
 * @param <V>
 */
public class OrderedPair<K,V> implements Pair<K,V>{

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof OrderedPair<?,?>){
            return this.equals(obj);
        }else throw new InvalidParameterException("obj is not instance of OrderedPair<?,?>");
    }

    public boolean equals(Pair<K, V> otherPair){
        return otherPair.getKey().equals(getKey()) && otherPair.getValue().equals(getValue());
    }

    @Override
    public int hashCode() {
        int result = getKey().hashCode();
        result = 31 * result + Objects.hashCode(getValue());
        return result;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
