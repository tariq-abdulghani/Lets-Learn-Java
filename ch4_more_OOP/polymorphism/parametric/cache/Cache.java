package ch4_more_OOP.polymorphism.parametric.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * Common Application of generics is container/data structure classes
 * @param <I>
 * @param <T>
 */
public class Cache<I, T extends Cacheable<I>>{

    private final Map<I, T> map;

    public Cache() {
        map = new HashMap<>();
    }

    public T getItemById(I id){
        return map.get(id);
    }

    public void put(T item){
        map.put(item.getId(), item);
    }

    public T remove(I id){
        return  map.remove(id);
    }
}
