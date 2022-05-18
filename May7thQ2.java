//Write a java code for fibonacci series.

import java.util.Scanner;

public class May7thQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth value to calculate fibonacci: ");

        int n = input.nextInt();

        System.out.println("The fibonacci of term 6 is: "+ fibonacci(n));

    }

    public  static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
