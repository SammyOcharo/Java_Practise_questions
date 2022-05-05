// odd even simple program
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = console.nextInt();
        if (number%2==0){
            System.out.println(number + " is an even number");
        }else {
            System.out.println(number + " is an odd number");
        }
    }
}