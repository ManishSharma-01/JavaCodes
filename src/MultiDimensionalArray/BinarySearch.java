package MultiDimensionalArray;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of number you want to store  ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value  ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a value to search  ");
        int search = sc.nextInt();
        int result = binary_search(arr, search);
        if (result == 0){
            System.out.print("Not found");
        }
        else
            System.out.println("Found at index "+ result);


    }

    public static int binary_search(int[] arr, int search) {
        int first = 0;
        int mid = 0;
        int last = arr.length - 1;
        boolean flag = false;
        while (first <= last) {
           mid = (first + last) / 2;
            if (arr[mid] == search) {
            flag = true;
                break;
            } else if (arr[mid] < search)
                first = mid + 1;
            else
                last = mid - 1;
        }
        
        if (flag)
            return mid;
        else
            return 0;

    }
}