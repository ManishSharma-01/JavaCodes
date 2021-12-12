package array;

import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter value : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter search value ");
        int search = sc.nextInt();
        boolean flag = false;
        for (int i = 0 ; i<size;i++){
            if (arr[i]==search){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}