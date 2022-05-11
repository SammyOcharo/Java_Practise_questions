import java.util.Scanner;

//java program to calculate factorial of a number
public class eighthMayQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number to calculate factorial: ");

        int number = input.nextInt();
        System.out.println("The factorial of " + number + " is " + factorial(number));
    }

    public static int factorial(int number){
        if (number ==0){
            return 1;
        }

        int results = 1;
        while(number != 0){
            results = results * number;
            number--;
        }
        return results;
    }
}
