package ch3_OOP.introduction;

public class CounterNoOOPDemo {
    public static void main(String[] args) {
        int counter1 = 0;
        int counter2 = 0;

        System.out.println("adding item in the first store");
        counter1 = increment(counter1);
        System.out.println("adding item in the second store");
        counter2 = increment(counter2);

        // if we have n stores we will have to modify the code to add variables
        // also we must be sure that we apply the proper method on the proper variable
    }

    public static int increment(int count){
        return count++;
    }

    public static int decrement(int count){
        return count--;
    }
}
