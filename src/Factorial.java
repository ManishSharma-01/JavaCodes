import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int fac = 1;

        System.out.println("Enter the number to find factorial of :");
        a = sc.nextInt();

        for (int i=1;i<=a;i++){
            fac = fac*i ;


        }
        System.out.println(fac);
    }
}
