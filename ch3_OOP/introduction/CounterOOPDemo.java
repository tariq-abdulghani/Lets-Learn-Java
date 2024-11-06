package ch3_OOP.introduction;

public class CounterOOPDemo {
    public static void main(String[] args) {
        Counter shoeStore = new Counter();
        Counter pantsStore = new Counter();

        shoeStore.increment();
        pantsStore.increment();
    }
}
