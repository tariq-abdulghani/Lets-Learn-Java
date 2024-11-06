package ch3_OOP.introduction;

public class Counter {
    private int count;

    public int getCount(){
        return  count;
    }

    public int increment(){
        return count++;
    }

    public int decrement(){
        return  count--;
    }

    @Override
    public String toString() {
        return "current count: "+ count;
    }
}
