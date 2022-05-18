import java.util.Scanner;
//write a java code to compute and check weather a number is peterson number(sum of the factorial of its digits adds upto the number itself.)
public class May10thQ2 {
    public static void main(String[] args) {
        System.out.println("Input the number to check weather it is a peterson number: ");
        int number = new Scanner(System.in).nextInt();

        if(Peterson(number)){
            System.out.println("The number "+ number+ " is a peterson number");
        }else {
            System.out.println("The number "+ number+ " is not a peterson number");
        }
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

    public static boolean Peterson(int number){
        int sum = 0;
        int reminder;
        int n = number;
        while(n > 0){
            reminder = n % 10;
            sum = sum + factorial(reminder);
            n = n/10;

        }
        return sum==number;
    }
}
