package functions;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Float si;
        si= simpleIntrest();
        System.out.print("Intrest is "+ si);
    }

    public static Float simpleIntrest(){
        Scanner sc = new Scanner(System.in);

        float rate;
        float amount;
        float time;

        System.out.print("Enter the Rate ");
        rate = sc.nextFloat();

        System.out.print("Enter the Amount ");
        amount = sc.nextFloat();

        System.out.print("Enter the Time in year ");
        time = sc.nextFloat();

        return (rate*amount*time)/100;

    }
}


