package array;

import java.util.Scanner;

public class ListingInArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a value :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are :");

        for (int j : arr) {
            System.out.println(j);
        }

    }
}
