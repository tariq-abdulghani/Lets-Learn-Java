package ch1_variables_control_flow;

public class ForLoopDemo {

    public static void main(String[] args) {
        // two ways to loop based on know count
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int[] nums = new int[]{1,2,3,4,5};
        printArray(nums);
    }

    public static void printRange(int start, int end){
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
    }

    public static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void printEvenWithinRange(int start, int end){

    }

    public static void printOddWithinRange(int start, int end){

    }

}
