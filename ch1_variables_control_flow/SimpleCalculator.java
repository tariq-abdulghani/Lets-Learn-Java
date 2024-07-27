package ch1_variables_control_flow;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // prompt user to enter number
        // prompt user to enter another number
        // prompt user for operation
        // print result

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter num1");
        int num1 = scanner.nextInt();
        System.out.println("please enter num2");
        int num2 = scanner.nextInt();
        System.out.println("please enter operation +, -, *, /");
//        char operation = (char) scanner.next().charAt(0);
        String operation = scanner.next();
        int result = 0;
        switch (operation){
            case "+":
                result = num1 + num2;
                break;
            case  "-":
                result = num1 - num2;
                break;
            case  "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("invalid operation");
        }
        // check for valid operation
        if(operation.length() ==1) System.out.println( num1+" "+operation + " " + num2+" "+" = "+ result);
    }
}
