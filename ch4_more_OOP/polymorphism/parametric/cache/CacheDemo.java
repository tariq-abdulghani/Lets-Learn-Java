package ch4_more_OOP.polymorphism.parametric.cache;

public class CacheDemo {
    public static void main(String[] args) {
        Cache<Integer, User> userCache = new Cache<>();
        Cache<String, Product> productCache = new Cache<>();

        User johnDoe = new User(1, "John Doe");
        User janeDoe = new User(2, "Jane Doe");

        Product pencil = new Product("pencil-1","Faber Castell", "Stationery" );
        Product fan = new Product("fan-1", "Air fan", "Electric Device");

        userCache.put(janeDoe);
        userCache.put(johnDoe);
        productCache.put(pencil);
        productCache.put(fan);

        System.out.printf(productCache.getItemById("fan-1").toString());

    }
}
