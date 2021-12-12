package functions;

import java.util.Scanner;

public class Functn1 {

    public static void main(String[] args) {
        int result;
        result = addTwoNumbers();
        System.out.print("Result is: "+result);

    }

    public static int addTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        int first;
        int second;


        System.out.print("Enter the first number: ");
        first = sc.nextInt();
        System.out.print("Enter the second number: ");
        second = sc.nextInt();

        return first+second;
    }
}
