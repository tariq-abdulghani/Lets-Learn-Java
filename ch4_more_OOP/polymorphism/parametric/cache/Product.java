package ch4_more_OOP.polymorphism.parametric.cache;

public class Product implements Cacheable<String>{

    private String id;
    private String name;
    private String category;

    public Product(String id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
