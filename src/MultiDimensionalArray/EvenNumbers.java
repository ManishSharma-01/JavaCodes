package MultiDimensionalArray;
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row");
        int row= sc.nextInt();
        System.out.println("Enter column");
        int column= sc.nextInt();
        int [][] arr= new int[row][column];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(i+","+j+"= ");
                arr[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}