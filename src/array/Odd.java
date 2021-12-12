package array;
import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int a=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter a value");
            arr[i]=sc.nextInt();
        }

        for (int i=0 ; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(i);
                a +=1;
            }
        } System.out.println("no of Odd number "+a);
    }
}