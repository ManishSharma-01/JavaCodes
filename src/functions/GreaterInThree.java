package functions;

import java.util.Scanner;

public class GreaterInThree {
    public static void main(String[] args) {
        int gnum;
        gnum = greatest();
        System.out.print("greatest number is " + gnum);
    }

    public static int greatest() {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Emter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        num2 = sc.nextInt();
        System.out.print("Enter the Third number: ");
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else if (num2 > num3) {
            return num2;
        } else
            return num3;
    }



    }