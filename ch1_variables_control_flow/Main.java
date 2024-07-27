package ch1_variables_control_flow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java !");
        // quick review
        // primitive data types
//        byte age;
//        int id;
//        long count;
//
//        float windSpeed;
//        double sqrRoot;
//
//        boolean flag;
//        char c;
//
//        System.out.println(6 / 8);
//        System.out.println(6f/8);
//
//        // ref data type
//        String name;
//        // array
//        // PrintStream System.out
//        // Scanner
//
//        // arithmetic operators

//        System.out.println(1 / 100);
//        System.out.println(1.f / 100);
//
//        System.out.println(10*(1+5));
//        System.out.println(10*1+5);
        int count = 0;
//        count = count +1;

//        System.out.println(count++);
//        System.out.println(count--);

//        int sum =0;
//        int[] dataInt = new int[]{1,2,3,4,5,6};
//
//        for (int i = 0; i < dataInt.length; i++) {
//            sum += dataInt[i];
//        }
//        System.out.println( (float) sum/ dataInt.length);
//        System.out.println(3%5);
//        System.out.println(100%5);
//        System.out.println(12%5);
//        System.out.println(36 %4);

//        System.out.println(count > 10);
        UnitConverter unitConverter = new UnitConverter();
        System.out.println(unitConverter.fromCmToMeter(150));

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }


}
