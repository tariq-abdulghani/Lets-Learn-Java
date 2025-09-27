package ch4_more_OOP.polymorphism.parametric.cache;

/**
 * All items to be cached must have an id
 * @param <I>
 */
public interface Cacheable<I>{
    I getId();
}
