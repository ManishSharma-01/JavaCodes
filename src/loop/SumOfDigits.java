package loop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int add = 0;

        System.out.print("Enter the number ");
        num = sc.nextInt();

        while (num > 0) {
            int remainder = num % 10;
            add = add + remainder;
            num = num / 10;
        }
        System.out.println(add);
    }
}
