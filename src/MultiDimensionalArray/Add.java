package MultiDimensionalArray;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] arr3 = new int[2][2];

        System.out.println("for array 1: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(i + "," + j + "= ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("For array 2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(i + "," + j + "= ");
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

