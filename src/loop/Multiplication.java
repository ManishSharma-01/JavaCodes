package loop;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;
        int num;
        int mul;
        do {


            System.out.print("Enter the number to find multiple of: ");
            num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                mul = num * i;
                System.out.println(num + "x" + i + "=" + mul);
            }

            System.out.print("Do you want to continue?(Y/N): ");
            choice = sc.next().toLowerCase().charAt(0);

        }
        while (choice == 'y');

    }
}

