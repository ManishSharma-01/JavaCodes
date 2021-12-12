package array;

import java.util.Scanner;

public class MaxiMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value:");
            arr[i] = sc.nextInt();
        }
        for (int j : arr){
            System.out.println(j);
        }
    }


}
