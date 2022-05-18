import java.util.Scanner;

/** * Simple Java Program to check or find if a number is Armstrong number or not.
 * * An Armstrong number of three digit is a number whose sum of cubes of its digit is equal
 * * to its number. For example 153 is an Armstrong number * of 3 digit because 1^3+5^3+3^3 or 1+125+27=153
 * * */


public class May6thQ2 {
    public static void main(String[] args) {

        //Prompt user to enter 3 digit number to check if its an Armstrong number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check if its Armstrong: \n");

        int number = input.nextInt();

        if (Armstrong(number)){
            System.out.println(number + " is an ArmStrong number");
        }else {
            System.out.println( number + " is not an ArmStrong number");
        }


    }

    private static boolean Armstrong(int number){
        int originalNumber = number;
        int finalNumber = 0;

        while(number !=0){
            int remainder = number%10;
            finalNumber = finalNumber+remainder*remainder*remainder;
            number = number/10;
        }
        if(originalNumber==finalNumber){
            return true;
        }
        return false;
    }
}
