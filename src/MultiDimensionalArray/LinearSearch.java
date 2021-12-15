package MultiDimensionalArray;

import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size you want in array :");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i=0; i<arr.length;i++){
            System.out.print("Enter the value "+i);
            arr[i]=sc.nextInt();
        }
}
}
