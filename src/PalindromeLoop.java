import java.util.Scanner;

public class PalindromeLoop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

//         int a;
//         int count;
//        System.out.print("Enter the number: ");
//        a = sc.nextInt();
//
//       count = 1;
//       while (count <11){w
//           count ++;
//           System.out.println(a);
//
//        int a;
//        int reverse = 0;
//        int rem;
//
//        System.out.print("Enter the number: ");
//        a = sc.nextInt();
//        while (a>0){
//            int rem = a%10;
//            reverse = reverse*10 + rem;
//            a = a/10;
//        }
//        System.out.println(rem);
//        System.out.println(a);


            int num;
            int reverse=0;
            System.out.print("Enter any number  ");
            num=sc.nextInt();
            int check=num;
            while(num>0){
                int remainder = num%10;
                reverse = reverse*10+remainder;
                num/=10;
            }
            if (check==reverse){
                System.out.println("It is palindrome");
            }
            else{
                System.out.println("It is not palindrome");
            }
        }



}
