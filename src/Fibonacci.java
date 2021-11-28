import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,n3 = 0;


        System.out.println("Enter the end point :");
        num = sc.nextInt();

        int n1=0;
        int n2=1;


        while (n2<num){
            System.out.print(n1+ " , "+n2);
            n3= n1+n2;

            n1=n2;
            n2=n3;



        }
        System.out.print(" , " + n3);
    }
}

