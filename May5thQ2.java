//Write a program in Java to find out if a number is prime in Java

import java.util.Scanner;

public class May5thQ2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = console.nextInt();

        if (number/number==1 && number%2 !=0 && number/1==number && number%3 !=0){
            System.out.println("number  " + number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }
        System.out.println();
    }
}
