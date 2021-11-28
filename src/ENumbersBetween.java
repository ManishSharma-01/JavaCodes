import java.util.Scanner;

public class ENumbersBetween {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s ;
        int j ;
        System.out.println("Enter the value to start from :");
        s= sc.nextInt();

        System.out.println("Entet the value to end on :");
        j= sc.nextInt();

        int count = 0;


        for ( int i = s ; i<j ;i++) {

            if (i % 2 == 0){
                count++;
            }

        }
        System.out.println(count);
    }
}
