//Write a Java program to check if a number is a palindrome in Java

import java.util.Scanner;

public class firstMayQ1 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        int palindrome = new Scanner(System.in).nextInt();

        if(isPalindrome(palindrome)){
            System.out.println(palindrome + " is a palindrome");
        }else {
            System.out.println(palindrome + " is not a palindrome");
        }

    }

    public static  Boolean isPalindrome (int number){
        int palindrome = number;
        int reverse = 0;
        

        while(palindrome !=0){
            int remainder = palindrome % 10;
            reverse = reverse *10 +remainder;
            palindrome = palindrome/10;
        }

        if (reverse==number){
            return  true;
        }else {
            return false;
        }
    }
}
