package loop;

import java.util.Scanner;

public class SplittingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Enter your word :");
        name = sc.nextLine();

        for (int i= 0;i<name.length() ;i++){

            System.out.println(name.charAt(i));
        }
    }
}
